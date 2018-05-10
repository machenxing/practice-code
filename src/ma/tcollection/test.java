package ma.tcollection;
import java.io.*;
import java.util.*;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		pro.setProperty("BJ","beijing");
		pro.setProperty("TJ", "TianJin");
		pro.setProperty("NJ","NanJing");
		File file=new File("J:"+File.separator+"area.properties");
		try{
			pro.store(new FileOutputStream(file),"Area Info");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
