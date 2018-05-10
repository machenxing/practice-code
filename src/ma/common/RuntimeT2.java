package ma.common;

public class RuntimeT2 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();
		try{
			run.exec("notepad.exe");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
