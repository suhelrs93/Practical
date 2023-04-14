package final_eg;
// Final Keyword --- provide restriction
//final variable -- cannot change the value of final variable
public class FinalVariable {
	final int value=50;// initialization of final variable
	void display() {
		//value=70;
		System.out.println(value);
		//we can't change the value of final variable
		// Compile time error
	}
	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();//creating object
		fv.display();
	}

}
