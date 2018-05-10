package ma.tnet;

import java.net.*;
import java.io.*;
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(30000);
		while(true){
			Socket s=ss.accept();
			PrintStream ps=new PrintStream(s.getOutputStream());
			ps.println("Ê¥µ®¿ìÀÖ£¡");
			ps.close();
			s.close();
		}

	}

}
