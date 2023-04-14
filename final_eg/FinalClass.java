package final_eg;
//Final Keyword ---
//final Class -- cannot extend the final class

public class FinalClass { // parent class
	void show() {
		System.out.println("Final class method");
	}
	
	// can't extend final class
	/*
	 * class test extends FinalClass{ void show() {
	 * System.out.println("Child class override method"); 
	 * }
	 */
	public static void main(String[] args) {
		FinalClass t = new FinalClass();
		t.show();
	}
	

}
