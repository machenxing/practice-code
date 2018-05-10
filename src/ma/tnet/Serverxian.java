package ma.tnet;

import java.net.*;
import java.io.*;
public class Serverxian implements Runnable{
	Socket s=null;
	BufferedReader br=null;
	public Serverxian(Socket s) throws IOException{
		this.s=s;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			String content=null;
			while((content=readFromClient())!=null){
				for(Socket s:IServer.socketList){
					PrintStream ps=new PrintStream(s.getOutputStream());
					ps.println(content);
				}
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
	private String readFromClient(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			IServer.socketList.remove(s);
		}
		return null;
	}

}
