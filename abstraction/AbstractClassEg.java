package abstraction;
abstract class ParentAbs {
	public ParentAbs() { // cons
		System.out.println("No-args Cons");
	}
	abstract void show();// abstract method
	void run() { // non abstract
		System.out.println("Non abstract method");
	}
}
class ChildAbs extends ParentAbs{
	
	@Override
	void show() {
		System.out.println("parent class abstract method");
	}
}
public class AbstractClassEg {
	public static void main(String[] args) {
		ParentAbs object = new ChildAbs();
		object.show();
		object.run();
	}
}
