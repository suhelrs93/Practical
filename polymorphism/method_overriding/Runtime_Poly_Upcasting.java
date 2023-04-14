package polymorphism.method_overriding;
/* if the reference variable of parent class refers
to the object of child class*/
class A{
	void run(){
		System.out.println("Parent class method");
	}
}
class B extends A{
	void run(){
		// super.run(); // it represent the parent class implementation
		System.out.println("Child class implementation");
	}
}
public class Runtime_Poly_Upcasting {
	public static void main(String[] args) {
		A obj=new B(); // upcasting
		obj.run();
	}

}
