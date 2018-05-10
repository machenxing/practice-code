package ma.tcollection;
import java.io.*;
import java.util.*;
public class PropertiesDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		File file=new File("J:"+File.separator+"area.properties");
		try{
			pro.load(new FileInputStream(file));
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("BJ属性值存在，内容是："+pro.getProperty("BJ"));
	}

}
