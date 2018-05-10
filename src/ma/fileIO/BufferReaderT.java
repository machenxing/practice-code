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
		System.out.print("请输入内容：");
		try{
			str=buf.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("输入的内容为："+str);

	}

}
