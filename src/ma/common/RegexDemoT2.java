package ma.common;
//ʹ��������ʽ���Ƿ�Ϸ�
import java.util.regex.*;
public class RegexDemoT2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234567890";
		if(Pattern.compile("[0-9]+").matcher(str).matches()){
			System.out.println("����������ɵģ�");
		}else{
			System.out.println("������������ɵģ�");
		}

	}

}
