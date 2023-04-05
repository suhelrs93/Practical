package static_eg;
class StaticMethod1{//class1
	//instance variable
	int rollno;
	String name;
	float fee;
	static String collage="Agpit";//static variable
	static void change() {// static method
		collage="SRM";
	}
	//Parameterized Constructor
	StaticMethod1(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//user defined method
	void display() {
		System.out.println(rollno+" "+name+" "+collage);
	}

}
public class StaticMethod {//main class
	public static void main(String[] args) {
		// no need to create object for static method
		// calling static method with class name
		StaticMethod1.change();
		
		//creating object
		StaticMethod1 s1=new StaticMethod1(102, "ram", 5000);
		StaticMethod1 s2=new StaticMethod1(222, "sham", 3000);
		
		s1.display();
		s2.display();
		
	}

}
