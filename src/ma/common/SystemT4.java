package ma.common;
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "������"+this.name+"�����䣺"+this.age;
	}
	public void finalize() throws Throwable{
		System.out.println("�����ͷ�-->"+this);
	}
}
public class SystemT4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per=new Person("����",30);
		per=null;
		System.gc();

	}

}
