package ma.fileIO;

import java.io.*;
public class BufferReaderT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		System.out.print("���������ݣ�");
		try{
			str=buf.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("���������Ϊ��"+str);

	}

}
