package ma.tcollection;
import java.util.*;
public class yongcollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add("����");
		c.add(6);
		System.out.println("����C��Ԫ�ظ���Ϊ��"+c.size());
		c.remove(6);
		System.out.println("����C��Ԫ�ظ���Ϊ��"+c.size());
		System.out.println("����C�Ƿ�����������ַ�����"+c.contains("����"));
		c.add("Android����");
		System.out.println("����C��Ԫ�أ�"+c);
		Collection books=new HashSet();
		books.add("Android����");
		books.add("�ᵱ�����");
		System.out.println("����C�Ƿ����books���ϣ�"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("����C��Ԫ�أ�"+c);
		c.clear();
		System.out.println("����C��Ԫ�أ�"+c);
		books.retainAll(c);
		System.out.println("����books��Ԫ�أ�"+books);
	}

}
