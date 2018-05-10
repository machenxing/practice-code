package ma.common;
//×Ö·û´®Ìæ»»
import java.util.regex.*;
public class RegexDemoT5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A1B22C333D4444E55555F";
		String pat="\\d+";
//		Pattern p=Pattern.compile(pat);
//		Matcher m=p.matcher(str);
		String newString=Pattern.compile(pat).matcher(str).replaceAll("_");
		System.out.println(newString);

	}

}
