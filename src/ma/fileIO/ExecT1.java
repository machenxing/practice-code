package ma.fileIO;
//输入两个数字相加
import java.io.*;
public class ExecT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int j=0;
		int i=0;
		BufferedReader buf=new BufferedReader(
				new InputStreamReader(System.in));
		String str=null;
		System.out.print("请输入第一个数字：");
		str=buf.readLine();
		i=Integer.parseInt(str);
		System.out.print("请输入第二个数字：");
		str=buf.readLine();
		j=Integer.parseInt(str);
		System.out.println(i+"+"+j+"="+(i+j));

	}

}
