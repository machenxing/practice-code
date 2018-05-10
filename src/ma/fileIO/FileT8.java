package ma.fileIO;

import java.io.File;
//import java.io.IOException;
public class FileT8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator);
		String str[]=f.list();
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}
