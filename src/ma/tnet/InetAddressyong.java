package ma.tnet;

import java.net.*;
public class InetAddressyong {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getByName("www.baidu.com");
		System.out.println("baidu�Ƿ�ɴ"+ip.isReachable(2000));
//		System.out.println(ip.getHostAddress());
		InetAddress local=InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println("�����Ƿ�ɴ"+local.isReachable(5000));
		System.out.println(local.getCanonicalHostName());

	}

}
