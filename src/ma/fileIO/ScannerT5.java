package ma.fileIO;

import java.util.*;
import java.io.*;
public class ScannerT5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator+"test.txt");
		Scanner scan=null;
		try{
			scan=new Scanner(f);
		}catch(Exception e){}
		StringBuffer str=new StringBuffer();
		while(scan.hasNext()){
			str.append(scan.next()).append('\n');
		}
		System.out.println("文件内容为："+str);
	}

}
