package ma.common;
//�ж��ַ�����ʽ�Ƿ�Ϸ�
import java.util.regex.*;
public class RegexDemoT3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="2018-04-13";
		String pat="\\d{4}-\\d{2}-\\d{2}";
//		Pattern p=Pattern.compile(pat);
//		Matcher m=p.matcher(str);
		if(Pattern.compile(pat).matcher(str).matches()){
			System.out.println("���ڸ�ʽ�Ϸ���");
		}else{
			System.out.println("���ڸ�ʽ���Ϸ���");
		}

	}

}
