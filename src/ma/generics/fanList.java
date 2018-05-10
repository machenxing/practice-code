package ma.generics;

import java.util.*;
public class fanList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList=new ArrayList<String>();
		strList.add("AAA");
		strList.add("BBB");
		strList.add("CCC");
//		strList.add(5);这里会报错，只能是String类型
		for(int i=0;i<strList.size();i++)
		{
			System.out.println(strList.get(i));
		}		

	}

}
