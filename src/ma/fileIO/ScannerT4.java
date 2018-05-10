package ma.fileIO;

import java.util.*;
import java.text.*;
public class ScannerT4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=null;
		Date date=null;
		System.out.print("输入日期（yyyy-MM-dd）:");
		if(scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){
			str=scan.next("^\\d{4}-\\d{2}-\\d{2}$");
			try{
				date=new SimpleDateFormat("yyyy-MM-dd").parse(str);
				System.out.println(date);
			}catch(Exception e){}
		}else{
			System.out.println("输入的日期格式错误！");
		}
	}

}
