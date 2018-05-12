package ma.Concurrency;
//通过回调函数向线程传递数据
class TData {
	public int value=0;
}
class Work
{
	public void process(TData data,Integer numbers[])
	{
		for(int n:numbers)
		{
			data.value+=n;
		}
//		return data.value;
	}
}
public class MyThread3 extends Thread{
	private Work work;
	public MyThread3(Work work)
	{
		this.work=work;
	}
	public void run()
	{
		java.util.Random random=new java.util.Random();
		TData data=new TData();
		int n1=random.nextInt(1000);
		int n2=random.nextInt(2000);
		int n3=random.nextInt(3000);
		Integer nums[]={n1,n2,n3};
		work.process(data,nums);
		System.out.println(String.valueOf(n1)+"+"+String.valueOf(n2)+"+"
				+String.valueOf(n3)+"="+data.value);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new MyThread3(new Work());
		thread.start();

	}

}
