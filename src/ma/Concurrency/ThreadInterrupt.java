package ma.Concurrency;
//使用interrupt方法终止线程
public class ThreadInterrupt extends Thread{
	public void run()
	{
		try
		{
			sleep(5000);
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread thread=new ThreadInterrupt();
		thread.start();
		System.out.println("在5秒之内按任意键中断线程！");
		System.in.read();
		thread.interrupt();
		thread.join();
		System.out.println("线程已经退出！");

	}

}
