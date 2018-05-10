package ma.fileIO;

import java.io.*;
class Send implements Runnable{
	private PipedOutputStream pos=null;
	public Send(){
		this.pos=new PipedOutputStream();
	}
	public void run(){
		String str="Hello World!";
		try{
			this.pos.write(str.getBytes());
			this.pos.close();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	public PipedOutputStream getPos(){
		return this.pos;
	}
}
class Receive implements Runnable{
	private PipedInputStream pis=null;
	public Receive(){
		this.pis=new PipedInputStream();
	}
	public void run(){
		byte b[]=new byte[1024];
		int len=0;
		try{
			len=this.pis.read(b);
			this.pis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("���յ������ǣ�"+new String(b,0,len));
	}
	public PipedInputStream getPis(){
		return this.pis;
	}
}
public class Guan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Send s=new Send();
		Receive r=new Receive();
		try{
			s.getPos().connect(r.getPis());
		}catch(IOException e){
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();

	}

}
