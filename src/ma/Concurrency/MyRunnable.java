package ma.Concurrency;
//使用Runnable实现Thread
public class MyRunnable implements Runnable{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable t1=new MyRunnable();
		MyRunnable t2=new MyRunnable();
		Thread thread1=new Thread(t1,"MyThread1");
		Thread thread2=new Thread(t2);
		thread2.setName("MyThread2");
		thread1.start();
		thread2.start();

	}

}
