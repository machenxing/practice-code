package ma.Concurrency;
//使用synchronized保证原子性，volatile并不能保证原子性
public class JoinThread extends Thread{
	public static int n=0;
	public static synchronized void inc()
	{
		n++;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				inc();
				sleep(3);
			}catch(Exception e)
			{				
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread threads[]=new Thread[100];
		for(int i=0;i<threads.length;i++)
		{
			threads[i]=new JoinThread();
		}
		for(int i=0;i<threads.length;i++)
		{
			threads[i].start();
		}
//		if(args.length>0)
			for(int i=0;i<threads.length;i++)
				threads[i].join();
		System.out.println("n="+JoinThread.n);

	}

}
