package ma.Concurrency;
//ʹ��interrupt������ֹ�߳�
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
		System.out.println("��5��֮�ڰ�������ж��̣߳�");
		System.in.read();
		thread.interrupt();
		thread.join();
		System.out.println("�߳��Ѿ��˳���");

	}

}
