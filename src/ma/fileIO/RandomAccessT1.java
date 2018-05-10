package ma.fileIO;

import java.io.File;
import java.io.RandomAccessFile;
public class RandomAccessT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		RandomAccessFile rdf=null;
		rdf=new RandomAccessFile(f,"rw");
		String name=null;
		int age=0;
		name="aaaaaaaa";
		age=30;
		rdf.writeBytes(name);
		rdf.writeInt(age);
		name="bbbb    ";
		age=31;
		rdf.writeBytes(name);
		rdf.writeInt(age);
		name="cccccc  ";
		age=32;
		rdf.writeBytes(name);
		rdf.writeInt(age);
		rdf.close();
		

	}

}
