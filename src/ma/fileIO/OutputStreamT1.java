package ma.fileIO;
//���ļ���д���ַ���
import java.io.*;
public class OutputStreamT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		OutputStream out=new FileOutputStream(f,true);//����true����ʾ����׷��д
		String str="\r\nHello World!!!";
		byte b[]=str.getBytes();
		out.write(b);
		out.close();

	}

}
