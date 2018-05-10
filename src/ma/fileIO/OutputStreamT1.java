package ma.fileIO;
//向文件中写入字符串
import java.io.*;
public class OutputStreamT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		OutputStream out=new FileOutputStream(f,true);//加上true即表示可以追加写
		String str="\r\nHello World!!!";
		byte b[]=str.getBytes();
		out.write(b);
		out.close();

	}

}
