package polymorphism.method_overriding;

/* Method Overriding
 * 1. same name method
 * 2. same parameters
 * 3. IS-A relation */

//creating parent class
class TestOverriding {
	void run() { // method 1
		System.out.println("running mode on");
	}
}
//creating child class
class Overriding extends TestOverriding{
	
	// defining same name method as its declared in the parent class
	void run() { // method 2
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		// Creating a object of child class
		Overriding a = new Overriding();
		a.run();
	}

}
