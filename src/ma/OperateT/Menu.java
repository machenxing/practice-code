package ma.OperateT;

public class Menu {
	public Menu(){
		while(true){
			this.show();
		}
	}
	public void show(){
		System.out.println("=====菜单系统=====");
		System.out.println("   [1]、增加数据");
		System.out.println("   [2]、删除数据");
		System.out.println("   [3]、修改数据");
		System.out.println("   [4]、查看数据");
		System.out.println("   [0]、系统退出\n");
		InputData input=new InputData();
		int i=input.getInt("请选择：","请输入正确的选项！");
		switch(i){
		case 1:{
			Operate.add();
			break;
		}
		case 2:{
			Operate.delete();
			break;
		}
		case 3:{
			Operate.update();
			break;
		}
		case 4:{
			Operate.find();
			break;
		}
		case 0:{
			System.exit(1);
			break;
		}
		default:{
			System.out.println("请选择正确的操作");
		}
		}
	}

}
