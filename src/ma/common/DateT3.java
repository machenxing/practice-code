package ma.common;
import java.text.DateFormat;
import java.util.Date;
public class DateT3 {
//��ӡ��ͬ��ʽʱ��Ĵ���
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df1=DateFormat.getDateInstance();
		DateFormat df2=DateFormat.getDateTimeInstance();
		System.out.println("DATE:"+df1.format(new Date()));
		System.out.println("DATETIME:"+df2.format(new Date()));

	}

}
