package polymorphism.method_overriding;

class Exam{// parent class
	int marks() { 
		return 0;
	}
}
class Comp extends Exam{ // 1st child class
	int marks() { // override method
		return 80;
	}
}
class Math extends Exam{ // 2nd child class
	int marks() { // override method
		return 70;
	}
}
class Science extends Exam{ // 3rd child class
	int marks() { // override method
		return 50;
	}
}
class Eng extends Exam{ // 4th child class
	int marks() { // override method
		return 90;
	}
}
class OverridingEg {
	public static void main(String[] args) {
		Comp c = new Comp();
		Math m = new Math();
		Science s = new Science();
		Eng e = new Eng();
		System.out.println("Computer marks is: "+c.marks());
		System.out.println("Math marks is: "+m.marks());
		s.marks();
		e.marks();
	}
}
