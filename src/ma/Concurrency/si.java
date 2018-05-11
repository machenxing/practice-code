package ma.Concurrency;

public class si extends Thread{
	private int i;
	public void run()
	{
		for(;i<100;i++)
		{
			System.out.println(getName()+i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		si sd=new si();
		for(int i=0;i<300;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20)
			{
				sd.start();
				System.out.println(sd.isAlive());
			}
			if(i>20&&!sd.isAlive())
			{
				sd.start();
			}
		}
	}

}
