package ma.tnet;

import java.net.*;
import java.io.*;
import java.util.*;
public class IServer {
	public static ArrayList<Socket> socketList=new ArrayList<Socket>();

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(30000);
		while(true)
		{
			Socket s=ss.accept();
			socketList.add(s);
			new Thread(new Serverxian(s)).start();
		}

	}

}
