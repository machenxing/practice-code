package ma.fileIO;

import java.io.File;
import java.io.IOException;
public class FileT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f=new File("j:\\test.txt");    此部分代码和下一行的代码二选一即可
		File f=new File("j:"+File.separator+"test.txt");
		try{
			f.createNewFile();
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
