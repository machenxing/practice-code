package ma.tenum;

public class TestEnum {

	public void judge(jijieEnum s)
	{
		switch(s)
		{
		case SPRING:
			System.out.println("���︴�յĴ���");
			break;
		case SUMMER:
			System.out.println("ʢ�ĵĹ�ʵ");
			break;
		case FALL:
			System.out.println("����Ƶ�֮��");
			break;
		case WINTER:
			System.out.println("Ω��çç֮����");
			break;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(jijieEnum s:jijieEnum.values())
		{
			System.out.println(s);
		}
		new TestEnum().judge(jijieEnum.SPRING);

	}

}
