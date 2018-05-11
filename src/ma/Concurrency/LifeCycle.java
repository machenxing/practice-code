package ma.Concurrency;

public class LifeCycle extends Thread{
	public void run()
	{
		int n=0;
		while((++n)<1000);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LifeCycle thread1=new LifeCycle();
		System.out.println("isAlive:"+thread1.isAlive());
		thread1.start();
		System.out.println("isAlive:"+thread1.isAlive());
		thread1.join();
		System.out.println("thread1ÒÑ¾­½áÊø£¡");
		System.out.println("isAlive:"+thread1.isAlive());

	}

}
