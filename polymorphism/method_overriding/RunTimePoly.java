package polymorphism.method_overriding;
/*Runtime polymorphism -- Dynamic method dispatch
 * overload a static method in java - compile time poly
 * overridden method called by the reference variable of papa class
 * overridden method is resolved at runtime rather than compile time
 */
public class RunTimePoly { // main class
	public static void main(String[] args) {
		Java_Student js; // reference variable of parent class (upcasting)
			js=new Pooja();
			System.out.println("Quality of Pooja is :"+js.quality());
			js=new Suhel();
			System.out.println("Quality of Suhel is :"+js.quality());
	}
}
class Java_Student { // parent class
	String quality() { // parent method
		return null;
	}
}
class Tushar extends Java_Student{//child class 1
	String quality() { // overridden method
		return "Active";
	}
}
class Pooja extends Java_Student{//child class 2
	String quality() { // overridden method
		return "Irregular";
	}
}
class Suhel extends Java_Student{//child class 3
	String quality() { // overridden method
		return "Active";
	}
}