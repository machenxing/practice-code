package ma.tcatch;

public class MyyiT {
	public static void firstException() throws MyYi{
		throw new MyYi("\"firstException()\"method occurs an exception!");
	}
	public static void secondException() throws MyYi{
		throw new MyYi("\"secondException()\"method occurs an exception!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			MyyiT.firstException();
			MyyiT.secondException();
		}catch(MyYi e2){
			System.out.println("Exception:"+e2.getMessage());
			e2.printStackTrace();
		}

	}

}
