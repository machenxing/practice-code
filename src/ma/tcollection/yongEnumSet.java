package ma.tcollection;
import java.util.*;
enum Season{
	SPRING,SUMMER,FALL,WINTER;
}

public class yongEnumSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet s1=EnumSet.allOf(Season.class);
		System.out.println(s1);
		EnumSet s2=EnumSet.noneOf(Season.class);
		System.out.println(s2);
		s2.add(Season.WINTER);
		s2.add(Season.SPRING);
		System.out.println(s2);
		EnumSet s3=EnumSet.of(Season.SUMMER,Season.WINTER);
		System.out.println(s3);
		EnumSet s4=EnumSet.range(Season.SUMMER,Season.WINTER);
		System.out.println(s4);
		EnumSet s5=EnumSet.complementOf(s4);
		System.out.println(s5);

	}

}
