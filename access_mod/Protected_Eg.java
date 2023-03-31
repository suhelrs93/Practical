package access_mod;
import package_eg.Protected_Eg_Test;
//If you want to access protected Method, it is possible only through Inheritance

public class Protected_Eg extends Protected_Eg_Test{
	public static void main(String[] args) {
		
		Protected_Eg ob  = new Protected_Eg();
		ob.result();
		}
 
}
