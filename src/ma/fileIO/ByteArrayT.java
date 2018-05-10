package ma.fileIO;
//向内存中写数并读取
import java.io.*;
public class ByteArrayT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HELLO WORLD!";
		ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		int temp=0;
		while((temp=bis.read())!=-1){
			char c=(char)temp;
			bos.write(Character.toLowerCase(c));
		}
		String newStr=bos.toString();
		try{
			bis.close();
			bos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(newStr);

	}

}
