package ma.Concurrency;
//Õ¨≤ΩÀ¯≤‚ ‘
public class ConsumerTest extends Thread{
	Consumer c=null;
	public ConsumerTest(Consumer c){
		this.c=c;
	}
	public void run()
	{
		try{
			sleep(3000);
			c.setMessage(new String("abc"));
			sleep(2000);
			c.setMessage(new String("def"));
			c.setMessage(Consumer.CLOSED);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Consumer c=new Consumer();
		ConsumerTest test=new ConsumerTest(c);
		test.start();
		Object msg;
		while((msg=c.startConsume().getMessage())!=null){
			System.out.println(msg);
		}
	}
}
