package super_keyword;
// real world example of super keyword
class Student { // parent class
	int stu_id;
	String name;
	Student (int stu_id, String name){ // patent class cons
		this.stu_id=stu_id;
		this.name=name;
	}
}
class Course extends Student{// child class
	float cou_fees; // child class data member
	Course(int stu_id, String name, float cou_fees){
		super(stu_id,name); // try to reuse parent class cons
		this.cou_fees=cou_fees;
	}
	
	void show() {
		System.out.println(stu_id+" "+name+" "+cou_fees);
	}
}
public class Solapur_Batch {
	public static void main(String[] args) {
		Course obj = new Course(1, "Prem Komti",2500f);
		obj.show();
	}
}
