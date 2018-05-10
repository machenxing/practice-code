package ma.fileIO;

import java.io.*;
public class PrintT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrintStream ps=new PrintStream(
				new FileOutputStream(new File("j:"+File.separator+"test.txt")));
		ps.print("hello ");
		ps.println("world!");
		ps.print("1+1=2");
		ps.close();

	}

}
