package ma.tcatch;

public class Yitwo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[5];
		try
		{
			a[6]=123;
			System.out.println("��Ҫ����ĳ���");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("������ArrayIndexOutOfBoundsException�쳣");
		}
		catch(ArithmeticException e)
		{
			System.out.println("������ArithmeticException�쳣");
		}
		catch(Exception e)
		{
			System.out.println("������Exception�쳣");
		}
		System.out.println("����");

	}

}
