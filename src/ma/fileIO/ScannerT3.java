package ma.fileIO;

import java.util.*;
public class ScannerT3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0;
		float f=0.0f;
		System.out.print("输入整数：");
		if(scan.hasNextInt()){
			i=scan.nextInt();
			System.out.println("整数数据："+i);
		}else{
			System.out.println("输入的不是整数！");
		}
		System.out.print("输入小数：");
		if(scan.hasNextFloat()){
			f=scan.nextFloat();
			System.out.println("小数为："+f);
		}else{
			System.out.println("输入的不是小数！");
		}
	}

}
