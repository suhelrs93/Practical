package method;

public class User_Defined {
	
		public int add(int a, int b) {
			return a+b;
			
		}
		public static void main(String[] args) {
			User_Defined ob= new User_Defined();
			System.out.println(ob.add(20,52));
		}
	}