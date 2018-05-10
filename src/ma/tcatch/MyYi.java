package ma.tcatch;

public class MyYi extends Throwable{
	public MyYi()
	{
		super();
	}
	public MyYi(String msg)
	{
		super(msg);
	}
	public MyYi(String msg,Throwable cause)
	{
		super(msg,cause);
	}
	public MyYi(Throwable cause)
	{
		super(cause);
	}

}
