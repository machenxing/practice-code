package ma.common;
import java.math.*;
//四舍五入运算
class MyMath{
	public static double add(double d1,double d2){
		BigDecimal b1=new BigDecimal(d1);
		BigDecimal b2=new BigDecimal(d2);
		return b1.add(b2).doubleValue();
	}
	public static double sub(double d1,double d2){
		BigDecimal b1=new BigDecimal(d1);
		BigDecimal b2=new BigDecimal(d2);
		return b1.subtract(b2).doubleValue();
	}
	public static double mul(double d1,double d2){
		BigDecimal b1=new BigDecimal(d1);
		BigDecimal b2=new BigDecimal(d2);
		return b1.multiply(b2).doubleValue();
	}
	public static double div(double d1,double d2,int len){
		BigDecimal b1=new BigDecimal(d1);
		BigDecimal b2=new BigDecimal(d2);
		return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public static double round(double d,int len){
		BigDecimal b1=new BigDecimal(d);
		BigDecimal b2=new BigDecimal(1);
		return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
public class BigDecimalDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("加法运算："+MyMath.round(MyMath.add(10.345, 3.333), 1));
		System.out.println("减法运算："+MyMath.round(MyMath.sub(10.345, 3.333), 3));
		System.out.println("乘法运算："+MyMath.round(MyMath.mul(10.345, 3.333), 2));
		System.out.println("加法运算："+MyMath.div(10.345,3.333,3));

	}

}
