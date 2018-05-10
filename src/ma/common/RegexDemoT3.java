package ma.common;
//判断字符串格式是否合法
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
			System.out.println("日期格式合法！");
		}else{
			System.out.println("日期格式不合法！");
		}

	}

}
