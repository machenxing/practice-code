package ma.fileIO;
//�ַ�������ļ�����
import java.io.*;
public class ReaderT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		Reader output=new FileReader(f);
		char c[]=new char[1024];
		int len=output.read(c);
		output.close();
		System.out.println("����Ϊ��\n"+new String(c,0,len));

	}

}
