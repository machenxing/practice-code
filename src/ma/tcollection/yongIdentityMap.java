package ma.tcollection;
import java.util.*;
public class yongIdentityMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put("����", 89);
		ihm.put("��ѧ", 78);
		ihm.put("java", 93);
		ihm.put("java", 98);
		System.out.println(ihm);

	}

}
