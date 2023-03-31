package access_mod;
import package_eg.Protected_Test;
// If you want to access protected Method, it is possible only through Inheritance
class Protected_AM extends Protected_Test{
	public static void main(String[] args) {
		
	Protected_AM ob  = new Protected_AM();
	ob.result();
	}
	

}
