package ma.tenum;

public class Testjijie {
	public Testjijie(jijie s)
	{
		System.out.println(s.getName()+"是一个"+s.getDesc()+"的季节");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Testjijie(jijie.FALL);

	}

}
