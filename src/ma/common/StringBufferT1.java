package ma.common;

public class StringBufferT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer();
		buf.append("Hello ");
		buf.append("World").append("!!");
		buf.append("\n");
		buf.append("����=").append(1).append("\n");
		buf.append("�ַ�=").append("C").append("\n");
		buf.append("����=").append(true);
		System.out.println(buf);

	}

}
