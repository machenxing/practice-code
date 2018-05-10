package ma.fileIO;

import java.io.*;
public class FileT11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File my=new File("j:"+File.separator);
		print1(my);

	}
	public static void print1(File file){
		if(file!=null){
			if(file.isDirectory()){
				File f[]=file.listFiles();
				if(f!=null){
					for(int i=0;i<f.length;i++){
						print1(f[i]);
					}
				}
			}
		}
		else{
			System.out.println(file);
		}
	}

}
