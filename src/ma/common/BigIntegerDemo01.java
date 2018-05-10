package ma.common;
import java.math.BigInteger;
//大整数运算
public class BigIntegerDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bi1=new BigInteger("123456789");
		BigInteger bi2=new BigInteger("987654321");
		System.out.println("加法操作："+bi2.add(bi1));
		System.out.println("减法操作："+bi2.subtract(bi1));
		System.out.println("乘法操作："+bi2.multiply(bi1));
		System.out.println("除法操作："+bi2.divide(bi1));
		System.out.println("最大数："+bi2.max(bi1));
		System.out.println("最小数："+bi2.min(bi1));
		BigInteger result[]=bi2.divideAndRemainder(bi1);
		System.out.println("商是："+result[0]+"；余数是："+result[1]);

	}

}
