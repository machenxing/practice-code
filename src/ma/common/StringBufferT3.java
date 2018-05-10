package ma.common;

public class StringBufferT3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer();
		buf.append("World!!");
		buf.insert(0, "Hello ");
		System.out.println(buf);
		buf.insert(buf.length(), "MM~");
		System.out.println(buf);

	}

}
