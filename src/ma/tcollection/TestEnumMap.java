package ma.tcollection;
import java.util.*;
enum Sjijie{
	SPRING,SUMMER,FALL,WINTER;
}
public class TestEnumMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap enumMap=new EnumMap(Sjijie.class);
		enumMap.put(Sjijie.SUMMER , "��");
		enumMap.put(Sjijie.SPRING, "ů��");
		System.out.println(enumMap);

	}

}
