package ma.common;

public class RegexDemoT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234567890";
		boolean flag=true;
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]<'0'||c[i]>'9'){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("是由数字组成的！");
		}else{
			System.out.println("不是由数字组成的！");
		}

	}

}
