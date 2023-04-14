package polymorphism.method_overloading;
// overload main method is possible which received string type array
public class Overload_Main_Method {
	// JVM call the main method with string array
	public static void main(String[] args) {
		System.out.println("Main with Sring type array");
		/*
		Overload_Main_Method  o = new Overload_Main_Method();
		
		o.main("hello");
		o.main(); */
	}
	public static void main(String args) {
		System.out.println("Main with without array ");
	}
	public static void main() {
		System.out.println("Main with without arguments");
	}

}
