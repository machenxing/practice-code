package ma.Concurrency;
//更改线程名
public class Thread2 extends Thread{
	private String who;
	public void run(){
		System.out.println(who+":"+this.getName());
	}
	public Thread2(String who){
		super();
		this.who=who;
	}
	public Thread2(String who,String name){
		super(name);
		this.who=who;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 thread1=new Thread2("thread1","MyThread1");
		Thread2 thread2=new Thread2("thread2");
		thread2.setName("MyThread2");
		Thread2 thread3=new Thread2("thread3");
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
