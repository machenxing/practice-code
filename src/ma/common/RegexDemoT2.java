package ma.common;
//使用正则表达式看是否合法
import java.util.regex.*;
public class RegexDemoT2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234567890";
		if(Pattern.compile("[0-9]+").matcher(str).matches()){
			System.out.println("是由数字组成的！");
		}else{
			System.out.println("不是由数字组成的！");
		}

	}

}
