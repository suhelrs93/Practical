package final_eg;
// Final Keyword --- 
//final Method -- cannot override final method
class FinalMethod1 {// parent class
	final void display() {// creating a final method
		System.out.println("This is a final method.");
	}
}
class Child extends FinalMethod1{// child class name main
	// try to override final method
	/* public final void display(){// parent class method
	 * System.out.println("The final method is overridden");
	 * }
	 */
}
public class FinalMethod {
	public static void main(String[] args) {// main method
		Child1 obj = new Child1();
		obj.display();
	}

}
