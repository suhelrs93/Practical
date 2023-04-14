package polymorphism.method_overloading;
/* Method Overloading - same name method
 * two way we can overload the methods
 * 1. changing no. of arguments
 * 2. changing data type of arguments */

//1. changing no. of arguments
public class OverloadingChangingArgs {
	static int sum(int a, int b) {// Two parameters/arguments
		return a+ b;
	}
	static int sum(int x, int y, int z) {// Three parameters/arguments
		return x+y+z;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(5, 6));
		System.out.println(OverloadingChangingArgs.sum(2,3,4));
	}

}
