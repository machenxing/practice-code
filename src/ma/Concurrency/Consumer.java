package ma.Concurrency;
//Í¬²½Ëø
import java.util.LinkedList;
public class Consumer {
	private final Object lock;
	private LinkedList<Object> msgQueue=new LinkedList<Object>();
	public static final Object CLOSED=new Object();
	public Consumer(){
		this.lock=this;
	}
	public Consumer startConsume(){
		synchronized (lock) {
			try{
				if(!msgQueue.isEmpty()){
					return this;
				}
				lock.wait(10000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		return this;
	}
	public Object getMessage() throws Exception{
		synchronized (lock) {
			Object message=msgQueue.poll();
			if(message instanceof Exception){
				throw (Exception) message;
			}
			if(message==null||message==CLOSED)
				return null;
			return message;
		}
	}
	public void setMessage(Object message){
		synchronized (lock) {
			msgQueue.add(message);
			lock.notify();			
		}
	}
	public void setClosed(){
		setMessage(CLOSED);
	}
}
