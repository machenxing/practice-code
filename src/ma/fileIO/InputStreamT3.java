package ma.fileIO;

import java.io.*;
public class InputStreamT3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		InputStream input=new FileInputStream(f);
		byte b[]=new byte[(int)f.length()];
		int len=input.read(b);
		input.close();
		System.out.println("读入数据的长度："+len);
		System.out.println("内容为：\n"+new String(b));

	}

}
