package ma.tcollection;
import java.util.*;
public class yongLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList books=new LinkedList();
		books.offer("Android江湖");
		books.push("会当凌绝顶");
		books.offerFirst("一览众山小");
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		System.out.println(books.peekFirst());
		System.out.println(books.peekLast());
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.pollLast());
		System.out.println(books);

	}

}
