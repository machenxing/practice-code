package ma.common;
//实现类的克隆操作
class mm implements Cloneable{
	private String name;
	public mm(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public String toString(){
		return "姓名："+this.name;
	}
	public Object clone()
			throws CloneNotSupportedException
			{
				return super.clone();
			}
}
public class CloneDemo01 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		mm p1=new mm("张三");
		mm p2=(mm)p1.clone();
		p2.setName("李四");
		System.out.println("原始对象："+p1);
		System.out.println("克隆后的对象："+p2);

	}

}
