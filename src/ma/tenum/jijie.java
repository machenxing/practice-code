package ma.tenum;

public class jijie {
	private final String name;
	private final String desc;
	public static final jijie SPRING=new jijie("春天","小桥流水");
	public static final jijie SUMMER=new jijie("夏天","烈日高照");
	public static final jijie FALL=new jijie("秋天","天高云淡");
	public static final jijie WINTER=new jijie("冬天","惟余莽莽");
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
