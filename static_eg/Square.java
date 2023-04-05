package static_eg;
import java.util.Scanner;
class Static_Square{
	static int sides=4;//static variable
	int len;
	// Parameterized constructor
	Static_Square(int len){
		this.len=len;
	}
	// user defined method
	void area() {
		System.out.println("Area Of Square : "+len*len);
	}
	static void perimeter(int len) { //static method
		System.out.println("Perimeter of Square : "+sides*len);
	}	
}
public class Square {
	public static void main(String[] args) {
		int length;
		System.out.println("Enter Length of Square:");
		Scanner sc = new Scanner(System.in);
		length=sc.nextInt();
		Static_Square ob=new Static_Square(length);
		ob.area();
		Static_Square.perimeter(length);
	}
}
