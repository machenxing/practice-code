package ma.fileIO;

import java.io.File;
import java.io.IOException;
public class FileT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f=new File("j:\\test.txt");    �˲��ִ������һ�еĴ����ѡһ����
		File f=new File("j:"+File.separator+"test.txt");
		try{
			f.createNewFile();
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
