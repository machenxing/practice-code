package ma.tenum;

public class jijie {
	private final String name;
	private final String desc;
	public static final jijie SPRING=new jijie("����","С����ˮ");
	public static final jijie SUMMER=new jijie("����","���ո���");
	public static final jijie FALL=new jijie("����","����Ƶ�");
	public static final jijie WINTER=new jijie("����","Ω��çç");
	private jijie(String name,String desc){
		this.name=name;
		this.desc=desc;
	}
	public String getName()
	{
		return this.name;
	}
	public String getDesc()
	{
		return this.desc;
	}
}
