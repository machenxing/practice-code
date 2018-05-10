package ma.tcollection;
import java.util.*;
public class yongcollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add("美美");
		c.add(6);
		System.out.println("集合C的元素个数为："+c.size());
		c.remove(6);
		System.out.println("集合C的元素个数为："+c.size());
		System.out.println("集合C是否包含美美的字符串："+c.contains("美美"));
		c.add("Android江湖");
		System.out.println("集合C的元素："+c);
		Collection books=new HashSet();
		books.add("Android江湖");
		books.add("会当凌绝顶");
		System.out.println("集合C是否包含books集合："+c.containsAll(books));
		c.removeAll(books);
		System.out.println("集合C的元素："+c);
		c.clear();
		System.out.println("集合C的元素："+c);
		books.retainAll(c);
		System.out.println("集合books的元素："+books);
	}

}
