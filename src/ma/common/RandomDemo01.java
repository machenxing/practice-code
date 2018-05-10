package ma.common;
import java.util.*;
//随机生成数
public class RandomDemo01{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int i=0;i<10;i++){
			System.out.print(r.nextInt(10000)+"\t");
		}

	}

}
