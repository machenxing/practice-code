package ma.fileIO;
//输出重定向
import java.io.*;
public class SystemT6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setOut(
				new PrintStream(
						new FileOutputStream("j:"+File.separator+"red.txt")));
		System.out.print("www.mldnjava.cn");
		System.out.println("，老管");

	}

}
