package ma.Concurrency;
//ʹ���Ƴ���־��ֹ�߳�
public class ThreadFlag extends Thread{
	public volatile boolean exit=false;
	public void run()
	{
		while(!exit);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThreadFlag thread=new ThreadFlag();
		thread.start();
		sleep(2000);
		thread.exit=true;
		thread.join();
		System.out.println("�߳��˳���");
	}
}
