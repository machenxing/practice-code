package ma.common;
import java.util.*;
public class ArraysT {
//数组的操作
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]={3,4,5,7,9,1,2,6,8};
		Arrays.sort(temp);
		System.out.println("排序后的数组："+Arrays.toString(temp));
		int point=Arrays.binarySearch(temp,3);
		System.out.println("元素3的位置在："+point);
		Arrays.fill(temp, 3);
		System.out.println("数组填充："+Arrays.toString(temp));

	}

}
