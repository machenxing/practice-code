package ma.fileIO;

import java.io.*;
public class InputStreamT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		InputStream input=new FileInputStream(f);
		byte b[]=new byte[128];
		input.read(b);
		input.close();
		System.out.println("ÄÚÈÝÎª£º\n"+new String(b));

	}

}
