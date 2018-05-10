package ma.common;

import java.util.*;

class Student01{
	private String name;
	private int age;
	public Student01(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){//��дequals�����������������δ����п��п���
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Student01)){
			return true;
		}
		Student01 stu=(Student01) obj;
		if(stu.name.equals(this.name)&&stu.age==this.age){
			return true;
		}else{
			return false;
		}
	}
	public void setName(String name){//set������������п���
		this.name=name;
	}
	public void setAge(int age){//set������������п���
		this.age=age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return name+"\t\t"+this.age;
	}
}
class StudentComparator implements Comparator<Student01>{
	public int compare(Student01 s1,Student01 s2){
		if(s1.equals(s2)){
			return 0;
		}else if(s1.getAge()<s2.getAge()){
			return 1;
		}else{
			return -1;
		}
	}
}
public class ComparatorT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student01 stu[]={new Student01("����",20),
				new Student01("����",22),new Student01("����",20),
				new Student01("����",20),new Student01("����",22)};
		Arrays.sort(stu,new StudentComparator());
		for(int i=0;i<stu.length;i++){
			System.out.println(stu[i]);
		}
		

	}

}
