package ma.Concurrency;
//�̲߳���ȫ��Singletonģʽ
class Singleton
{
	private static Singleton sample;
	private Singleton()
	{		
	}
	public static Singleton getInstance()//��ӹؼ���synchronized���Ϳɱ���̰߳�ȫ
	{
		if(sample==null)
		{
			Thread.yield();//Ϊ�˷Ŵ�Singletonģʽ���̲߳���ȫ��
			sample=new Singleton();
		}
		return sample;
	}
}
public class MyThread1 extends Thread{
	public void run()
	{
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread threads[]=new Thread[5];
		for(int i=0;i<threads.length;i++)
			threads[i]=new MyThread1();
		for(int i=0;i<threads.length;i++)
			threads[i].start();

	}

}
