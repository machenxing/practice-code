package ma.tnet;
//�˲��ִ��뱨����ע��
import java.net.*;
import java.io.*;
public class IClient{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("127.0.0.1",30000);
//		new Thread(new ClientThread(s).start());
		PrintStream ps=new PrintStream(s.getOutputStream());
		String line=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while((line=br.readLine())!=null){
			ps.println(line);
		}

	}

}
