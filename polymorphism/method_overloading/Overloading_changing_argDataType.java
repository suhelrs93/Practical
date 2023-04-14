package polymorphism.method_overloading;
/* Method Overloading - same name method
 * two way we can overload the methods
 * 1. changing no. of arguments
 * 2. changing data type of arguments */

//2. changing data type of arguments
public class Overloading_changing_argDataType {
	static int sum(int a, int b) {// integer type parameters/arguments
		return a+ b;
	}
	// Double type parameters/arguments
	static double sum(double a, double b) {
		return a+ b;
	}
	
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argDataType.sum(5, 6));
		System.out.println(Overloading_changing_argDataType.sum(5.1, 6.3));
	}

}
