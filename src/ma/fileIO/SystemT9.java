package ma.fileIO;
//重定向输入
import java.io.*;
public class SystemT9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(
				new FileInputStream("j:"+File.separator+"red.txt"));
		InputStream input=System.in;
		byte b[]=new byte[1024];
		int len=input.read(b);
		System.out.println("输入的内容为："+new String(b,0,len));
		input.close();

	}

}
