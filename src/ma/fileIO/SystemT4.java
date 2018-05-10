package ma.fileIO;

import java.io.InputStream;
public class SystemT4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream input=System.in;
		byte b[]=new byte[10];
		System.out.println("请输入内容：");
		int len=input.read(b);
		System.out.println("输出的内容为："+new String(b,0,len));
		input.close();

	}

}
