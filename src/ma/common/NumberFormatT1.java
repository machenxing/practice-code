package ma.common;
import java.text.*;
public class NumberFormatT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf=null;
		nf=NumberFormat.getInstance();
		System.out.println("��ʽ�������֣�"+nf.format(10000000));
		System.out.println("��ʽ�������֣�"+nf.format(1000.345));

	}

}
