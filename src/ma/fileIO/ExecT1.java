package ma.fileIO;
//���������������
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
		System.out.print("�������һ�����֣�");
		str=buf.readLine();
		i=Integer.parseInt(str);
		System.out.print("������ڶ������֣�");
		str=buf.readLine();
		j=Integer.parseInt(str);
		System.out.println(i+"+"+j+"="+(i+j));

	}

}
