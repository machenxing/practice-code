package ma.Concurrency;
//从线程返回数据
public class MyThread extends Thread{
	private String value1;
	private String value2;
	public void run()
	{
		value1="zhizhi";
		value2="i love you!";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();
/*		while(thread.value1==null||thread.value2==null)
			sleep(100);*/
		thread.join();
		System.out.println("value1:"+thread.value1);
		System.out.println("value2:"+thread.value2);

	}

}
