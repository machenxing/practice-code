package ma.tcollection;
import java.util.*;
public class tihuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List all=new ArrayList();
		Collections.addAll(all,"1、MLDN","2、LXH","3、mldnjava");
		Iterator iter=all.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"、");
		}
		Collections.swap(all,0,2);
		System.out.println("\n交换后的集合：");
		iter=all.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"、");
		}

	}

}
