package polymorphism.method_overriding;

public class Result { // main class
	public static void main(String[] args) {
		Exams e; // reference variable of parent class (upcasting)
			e=new Computer();
			System.out.println("Marks of Computer : "+e.marks());
			e=new English();
			System.out.println("Marks of English : "+e.marks());
	}

}

class Exams{// parent class
	int marks() { 
		return 0;
	}
}
class Maths extends Exams{ // Child class 1
	int marks() { // override method
		return 75;
	}
}
class Computer extends Exams{ // Child class 2
	int marks() { // override method
		return 90;
	}
}
class Sci extends Exams{ // Child class 3
	int marks() { // override method
		return 60;
	}
}
class English extends Exams{ // Child class 4
	int marks() { // override method
		return 85;
	}
}
class Phy extends Exams{ // Child class 5
	int marks() { // override method
		return 69;
	}
}