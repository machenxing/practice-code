package ma.common;
import java.util.*;
public class DateT2 {
//打印当前时间字段的代码
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=new GregorianCalendar();
		System.out.println("YEAR:"+calendar.get(Calendar.YEAR));
		System.out.println("MONTH:"+(calendar.get(Calendar.MONTH)+1));
		System.out.println("DAY_OF_MONTH:"+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("HOUR_OF_DAY:"+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE:"+calendar.get(Calendar.MINUTE));
		System.out.println("SECOND:"+calendar.get(Calendar.SECOND));
		System.out.println("MILLISECOND:"+calendar.get(Calendar.MILLISECOND));

	}

}
