package ma.tcatch;

public class Yichang1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		try
		{
			x=0;
			y=5/x;
			System.out.println("��Ҫ����ĳ���");
		}
		catch(ArithmeticException e)
		{
			System.out.println("�������쳣����ĸ����Ϊ0");
		}
		System.out.println("�������н���");

	}

}
