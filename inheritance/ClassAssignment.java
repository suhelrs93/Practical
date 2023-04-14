package inheritance;
//  Single Inheritance 
class Arithmatic{ // Parent class
	int add(int a, int b) { // user defined parameterized method
		int sum = a+b; // calculated sum in local variable
		return sum; // returning result in local variable
	}
}
class Adder extends Arithmatic{ // child class
	// just need to extends for declaring IS_A relation
}
public class ClassAssignment { // main class
	public static void main(String[] args) {// main method
		int a=25;
		int b=56;
		Adder child = new Adder();// created object of child class
		// passing arguments to parameterized method of Parent class by using object of child class
		System.out.println("Addition of "+a+" and "+b+" is= "+child.add(a, b));
	}
}




