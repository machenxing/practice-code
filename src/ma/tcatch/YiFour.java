package ma.tcatch;

public class YiFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException aoe)
		{
			System.out.println("�쳣"+aoe);
		}
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("�쳣"+ae);
		}

	}

}
