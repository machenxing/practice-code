package ma.tenum;

public class TestEnum {

	public void judge(jijieEnum s)
	{
		switch(s)
		{
		case SPRING:
			System.out.println("万物复苏的春天");
			break;
		case SUMMER:
			System.out.println("盛夏的果实");
			break;
		case FALL:
			System.out.println("天高云淡之秋");
			break;
		case WINTER:
			System.out.println("惟余莽莽之冬日");
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
