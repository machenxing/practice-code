package ma.common;
import java.util.*;
public class ArraysT {
//����Ĳ���
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]={3,4,5,7,9,1,2,6,8};
		Arrays.sort(temp);
		System.out.println("���������飺"+Arrays.toString(temp));
		int point=Arrays.binarySearch(temp,3);
		System.out.println("Ԫ��3��λ���ڣ�"+point);
		Arrays.fill(temp, 3);
		System.out.println("������䣺"+Arrays.toString(temp));

	}

}
