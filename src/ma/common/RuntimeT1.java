package ma.common;

public class RuntimeT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();
		System.out.println("JVM������ڴ�����"+run.maxMemory());
		System.out.println("JVM�Ŀ����ڴ�����"+run.freeMemory());
		String str="Hello "+"World������"+"\t"+"Welcome to Beijing~";
		System.out.println(str);
		for(int x=0;x<1000;x++){
			str +=x;
		}
		System.out.println("����String֮��JVM�Ŀ����ڴ�����"+run.freeMemory());
		run.gc();
		System.out.println("��������֮��JVM�Ŀ����ڴ�����"+run.freeMemory());

	}

}
