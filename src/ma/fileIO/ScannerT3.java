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
		System.out.print("����������");
		if(scan.hasNextInt()){
			i=scan.nextInt();
			System.out.println("�������ݣ�"+i);
		}else{
			System.out.println("����Ĳ���������");
		}
		System.out.print("����С����");
		if(scan.hasNextFloat()){
			f=scan.nextFloat();
			System.out.println("С��Ϊ��"+f);
		}else{
			System.out.println("����Ĳ���С����");
		}
	}

}
