package polymorphism.method_overriding;

class Father{
	void shoot() {
		System.out.println("I am the father! I am a right-handed shooter!");
	}
}
class Child extends Father{
	void shoot() { // override method
		System.out.println("I am the Sun! I am a left-handed shooter!");
	}
}
public class MethodOverridingRL {
	public static void main(String[] args) {
		Father f = new Father();
		f.shoot(); // Here the parent class method get called.
		Father fc = new Child();
		fc.shoot(); // This is dynamic method dispatch.
		//The compiler decided method call at runtime.
	}
}
