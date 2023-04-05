package method;
import java.util.Scanner;
public class User_DefinedEg3 {
	public int sum(int a, int b, int c) {
		return a+b+c; // it will return addition of parameters
	}
	public float average(float a, float b, float c) {
		float add=a+b+c;
		float avg=add/3;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int num3 = sc.nextInt();
		User_DefinedEg3 obj= new User_DefinedEg3();
		System.out.println("Addition= "+ obj.sum(num1, num2, num3));
		System.out.println("Average= "+ obj.average(num1, num2, num3));	
	}
}
