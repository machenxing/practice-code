package ma.common;

public class StringBufferT7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer();
		buf.append("Hello ").append("World!!");
		buf.replace(6,11,"AAA");
		String str=buf.delete(6, 15).toString();
		System.out.println("删除之后的结果："+str);

	}

}
