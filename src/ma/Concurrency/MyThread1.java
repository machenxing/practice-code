package ma.Concurrency;
//线程不安全的Singleton模式
class Singleton
{
	private static Singleton sample;
	private Singleton()
	{		
	}
	public static Singleton getInstance()//添加关键字synchronized，就可变成线程安全
	{
		if(sample==null)
		{
			Thread.yield();//为了放大Singleton模式的线程不安全性
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
