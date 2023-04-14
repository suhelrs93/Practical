package inheritance;

public class Aggregration_Eg_HAS_A {
	public static void main(String[] args) {
Address a = new Address("Ashti", "Beed", "India");
		Student s = new Student(01, "Ram", a);
		
		s.show();
	}

}
