package ma.common;

public class RuntimeT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();
		System.out.println("JVM的最大内存量："+run.maxMemory());
		System.out.println("JVM的空闲内存量："+run.freeMemory());
		String str="Hello "+"World！！！"+"\t"+"Welcome to Beijing~";
		System.out.println(str);
		for(int x=0;x<1000;x++){
			str +=x;
		}
		System.out.println("操作String之后，JVM的空闲内存量："+run.freeMemory());
		run.gc();
		System.out.println("垃圾回收之后，JVM的空闲内存量："+run.freeMemory());

	}

}
