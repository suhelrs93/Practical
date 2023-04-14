package inheritance;

public class SingleInheritance { // main class
	public static void main(String[] args) {
		SIChild child = new SIChild();// create a object of child class
		// by using child object we can use parent class method
		child.display();
		child.show();
	}
}

class SIParent { // Parent class
	void show() { // Parent class user defined method
		System.out.println("Show the details of parent class");
	}
}

class SIChild extends SIParent { // child class
	void display() {// child class user defined method
		System.out.println("Displat the Result Of child Class");
	}
}
