package ma.fileIO;

import java.io.*;
public class DateOutputStreamT {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DataOutputStream dos=null;
		File f=new File("j:"+File.separator+"order.txt");
		dos=new DataOutputStream(new FileOutputStream(f));
		String names[]={"maozi","chenyi","kuzi"};
		float prices[]={98.3f,30.3f,50.5f};
		int nums[]={3,2,1};
		for(int i=0;i<names.length;i++){
			dos.writeChars(names[i]);
			dos.writeChar('\t');
			dos.writeFloat(prices[i]);
			dos.writeChar('\t');
			dos.writeInt(nums[i]);
			dos.writeChar('\n');
		}
		dos.close();

	}

}
