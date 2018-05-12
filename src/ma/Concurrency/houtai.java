package ma.Concurrency;

public class houtai extends Thread{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(getName()+" "+i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		houtai t=new houtai();
		t.setDaemon(true);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}

	}

}
