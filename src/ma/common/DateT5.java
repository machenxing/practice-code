package ma.common;
import java.text.*;
import java.util.*;
public class DateT5 {
//转换日期格式的代码
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strDate="2018-4-9 20:35:30.345";
		String pat1="yyyy-M-d HH:mm:ss.SSS";
		String pat2="yyyy年M月d日 HH时mm分ss秒SSS毫秒";
		SimpleDateFormat sdf1=new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2=new SimpleDateFormat(pat2);
		Date d=null;
		try{
			d=sdf1.parse(strDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));

	}

}
