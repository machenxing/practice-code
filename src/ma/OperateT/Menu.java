package ma.OperateT;

public class Menu {
	public Menu(){
		while(true){
			this.show();
		}
	}
	public void show(){
		System.out.println("=====�˵�ϵͳ=====");
		System.out.println("   [1]����������");
		System.out.println("   [2]��ɾ������");
		System.out.println("   [3]���޸�����");
		System.out.println("   [4]���鿴����");
		System.out.println("   [0]��ϵͳ�˳�\n");
		InputData input=new InputData();
		int i=input.getInt("��ѡ��","��������ȷ��ѡ�");
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
			System.out.println("��ѡ����ȷ�Ĳ���");
		}
		}
	}

}
