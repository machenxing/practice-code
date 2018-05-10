package ma.common;

public class StringBufferT5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer();
		buf.append("Hello ").append("World!!");
		buf.replace(6,11,"AAA");
		System.out.println("内容替换后的结果："+buf);

	}

}
