package ma.tcatch;
import java.io.*;
public class Fangwen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis=new FileInputStream("a.txt");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}

	}

}
