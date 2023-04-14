package polymorphism.method_overloading;
// changing return type is not possible in case of method overloading
public class ChangingReturnType {
	static int sum(int a, int b) {// integer return type
		return a+ b;
	}
	// double return type
	static double sum(int a, int b) {
		return a+ b;
	}
	
	public static void main(String[] args) {
		System.out.println(ChangingReturnType.sum(5, 6));
		
	}


}
