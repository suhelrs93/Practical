package abstraction;
import java.util.Scanner;
abstract class Shape{ // abstract class --parent class
	abstract void areaOfRectangle(int length, int width); // abstract method 1
	abstract void perimeterOfRectangle(int length, int width); // abstract method 2
}
class RectArea extends Shape{// 1st child class
	// abstract method of parent class
	@Override
	void areaOfRectangle(int length, int width) {
		System.out.println("Area of Rectangle = "+(length*width));
	}

@Override
void perimeterOfRectangle(int length, int width) {
	// TODO Auto-generated method stub
	System.out.println("Perimeter of Rectangle = "+(2*(length+width)));
	
}
}

/*
 * class RectPeri extends Shape{// 2nd child class // abstract method of parent
 * class
 * 
 * @Override void perimeterOfRectangle(int length, int width) {
 * System.out.println("Perimeter of Rectangle = "+(2*(length+width))); } }
 */
public class TestAbs { // main class
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in); // object creation of Scanner class
		System.out.println("Enter Length of Rectangle:");
		int length = sc.nextInt(); // Initialization of local variable by user
		System.out.println("Enter Width of Rectangle:");
		int width = sc.nextInt();// Initialization of local variable by user
		//object creation
		RectArea area = new RectArea();
		//RectPeri peri = new RectPeri();
		// method call with arguments
		area.areaOfRectangle(length, width);
		area.perimeterOfRectangle(length, width);
	}

}