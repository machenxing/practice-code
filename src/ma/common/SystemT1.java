package ma.common;

public class SystemT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<30000000;i++){
			sum +=i;
		}
		long endtime=System.currentTimeMillis();
		System.out.println((starttime)+"����");
		System.out.println((endtime)+"����");
		System.out.println("���㻨��ʱ�䣺"+(endtime-starttime)+"����");

	}

}
