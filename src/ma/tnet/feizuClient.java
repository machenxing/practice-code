package ma.tnet;
//非阻塞Socket通信客户端
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.net.*;
import java.io.*;
import java.util.*;
public class feizuClient {
	private Selector selector=null;
	private Charset charset=Charset.forName("UTF-8");
	private SocketChannel sc=null;
	public void init()throws IOException
	{
		selector=Selector.open();
		InetSocketAddress isa=new InetSocketAddress("127.0.0.1",30000);
		sc=SocketChannel.open(isa);
		sc.configureBlocking(false);
		sc.register(selector, SelectionKey.OP_READ);
		new ClientThread().start();
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLine())
		{
			String line=scan.nextLine();
			sc.write(charset.encode(line));
		}
	}
	private class ClientThread extends Thread
	{
		public void run()
		{
			try
			{
				while(selector.select()>0)
				{
					for(SelectionKey sk : selector.selectedKeys())
					{
						selector.selectedKeys().remove(sk);
						if(sk.isReadable())
						{
							SocketChannel sc=(SocketChannel)sk.channel();
							ByteBuffer buff=ByteBuffer.allocate(1024);
							String content="";
							while(sc.read(buff)>0)
							{
								sc.read(buff);
								buff.flip();
								content+=charset.decode(buff);
							}
							System.out.println("聊天信息："+content);
							sk.interestOps(SelectionKey.OP_READ);
						}
					}
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new feizuClient().init();

	}

}
