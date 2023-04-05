package method;
import java.util.Scanner;

public class User_DefinedEg2 {
	public static void positive_or_not(int number) {
		if (number>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		positive_or_not(number);
	}

}
