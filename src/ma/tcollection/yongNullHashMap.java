package ma.tcollection;
import java.util.*;
public class yongNullHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(null, null);
		hm.put(null, null);
		hm.put("a", null);
		System.out.println(hm);

	}

}
