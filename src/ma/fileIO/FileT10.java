package ma.fileIO;

import java.io.File;
//import java.io.IOException;
public class FileT10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("j:"+File.separator);
		if(f.isDirectory()){
			System.out.println(f.getPath()+"·����Ŀ¼");
		}else{
			System.out.println(f.getPath()+"·������Ŀ¼");
		}

	}

}
