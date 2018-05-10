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
		System.out.println((starttime)+"毫秒");
		System.out.println((endtime)+"毫秒");
		System.out.println("计算花费时间："+(endtime-starttime)+"毫秒");

	}

}
