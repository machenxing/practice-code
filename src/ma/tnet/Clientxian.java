package ma.tnet;

import java.net.*;
import java.io.*;
public class Clientxian implements Runnable {
	private Socket s=null;
	BufferedReader br=null;
	public Clientxian(Socket s) throws IOException{
		this.s=s;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try{
			String content=null;
			while((content=br.readLine())!=null){
				System.out.println(content);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
