package inheritance;

public class MultilevelInheritance { 
	// main class
		public static void main(String[] args) {
			SIChild2 child = new SIChild2();// create a object of child class2
			child.display();
			child.show();
			child.print();
		}
	}

	class SIParent1 { // Parent class
		void show() { // Parent class user defined method
			System.out.println("Show the details of Parent class");
		}
	}
	// cjild class of SIParent & parent class of SIChild2
	class SIChild1 extends SIParent1 {
		void display() {// child class user defined method
			System.out.println("Displat the Result Of child Class1");
		}
	}
	class SIChild2 extends SIChild1 { // child class
		void print() { // child class user defined method
			System.out.println("Print the output of the child class 2");
		}
}
