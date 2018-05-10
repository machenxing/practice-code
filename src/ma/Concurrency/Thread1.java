package ma.Concurrency;
//输出线程名
public class Thread1 extends Thread{
	public void run()
	{
		System.out.println(this.getName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread1 thread1=new Thread1();
		Thread1 thread2=new Thread1();
		thread1.start();
		thread2.start();

	}

}
