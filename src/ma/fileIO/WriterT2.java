package ma.fileIO;

import java.io.*;
public class WriterT2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		Writer out=new FileWriter(f,true);
		String str="\r\nAAAA\r\nHello World!!!";
		out.write(str);
		out.close();

	}

}
