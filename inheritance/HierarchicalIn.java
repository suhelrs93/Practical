package inheritance;
// Hierarchical Inheritance
class Operating_System { // parent class A
	void boost() {
		System.out.println("Boosting mode on");
	}
}
class Windows extends Operating_System { // child class 1
	void run() {
		System.out.println("run mode on");
	}
}
class Linux extends Operating_System{// child class 2
	void Storage_capasity() {
		System.out.println("Storage capasity is very high");
	}
}
public class HierarchicalIn {
	public static void main(String[] args) {
		Linux b = new Linux();
		b.boost();
		b.Storage_capasity();
		Windows c = new Windows();
		c.run();
		c.boost();
	}

}
