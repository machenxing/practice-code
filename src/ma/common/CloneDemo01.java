package ma.common;
//ʵ����Ŀ�¡����
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
		return "������"+this.name;
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
		mm p1=new mm("����");
		mm p2=(mm)p1.clone();
		p2.setName("����");
		System.out.println("ԭʼ����"+p1);
		System.out.println("��¡��Ķ���"+p2);

	}

}
