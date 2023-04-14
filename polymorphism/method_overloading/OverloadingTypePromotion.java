package polymorphism.method_overloading;

public class OverloadingTypePromotion {// main class
	void add (int a, double b) { //method 1
		System.out.println(a+b);
	}
	void add (int a, int b, int c) { //method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		OverloadingTypePromotion obj = new OverloadingTypePromotion();// obj
		obj.add(2, 3);
		obj.add(10,30,20);
		
	}

}
//byte--
