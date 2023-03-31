package access_mod;
// private datamember/constructor/method/ not for class except nested class

class Test {
	private int a=10;
	private void display() {
		System.out.println("Private method");
	}
}
public class Private_AM {
	public static void main(String[] args) {
		Test obj = new Test();
		// Compilation error
		System.out.println(obj.a);// outside class can't access private datamember
		obj.display();// outside class can't access private method
	}

}
