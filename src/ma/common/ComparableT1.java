package ma.common;
import java.util.*;
//重写compareTo排序
class Student implements Comparable<Student>{
	private String name;
	private float score;
	private int age;
	public Student(String name,int age,float score){
		this.name=name;
		this.age=age;
		this.score=score;
	}
	public String toString(){
		return name+"\t\t"+this.age+"\t\t"+this.score;
	}
	public int compareTo(Student stu){
		if(this.score>stu.score){
			return -1;
		}
		if(this.score<stu.score){
			return 1;
		}else if(this.age<stu.age){
			return -1;
		}else{
			return 0;
		}
	}
}
public class ComparableT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu[]={new Student("张三",20,90.0f),
				new Student("李四",20,90.0f),new Student("王五",20,99.0f),
				new Student("赵六",20,70.0f),new Student("孙七",20,100.0f)};
		Arrays.sort(stu);
		for(int i=0;i<stu.length;i++){
			System.out.println(stu[i]);
		}

	}

}
