package ma.common;

import java.util.*;
import java.text.SimpleDateFormat;
public class MyTask extends TimerTask{	
	public void run(){
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("当前系统时间为："+sdf.format(new Date()));
	}

}
