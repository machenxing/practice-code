package ma.fileIO;

import java.io.*;
public class WriterT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		Writer out=new FileWriter(f);
		String str="Hello World!!!";
		out.write(str);
		out.close();
		

	}

}
