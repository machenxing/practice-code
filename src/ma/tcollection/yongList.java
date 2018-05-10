package ma.tcollection;
import java.util.*;
public class yongList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books=new ArrayList();
		books.add(new String("AAA"));
		books.add(new String("BBB"));
		books.add(new String("CCC"));
		System.out.println(books);
		books.add(new String("DDD"));
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		books.remove(2);
		System.out.println(books);
		System.out.println(books.indexOf(new String("DDD")));
		books.set(1, new String("BBB"));
		System.out.println(books);
		System.out.println(books.subList(1, 2));

	}

}
