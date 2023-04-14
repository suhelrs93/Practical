package polymorphism;
// in my subclass not use overriding
class Test{// parent class
	void show() {// user defined parent class method
		System.out.println("Show result");
	}
}

class Without_Overriding extends Test {
	public static void main(String[] args) {
		Without_Overriding obj = new Without_Overriding();
		obj.show();
	}
}
