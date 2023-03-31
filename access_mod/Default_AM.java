package access_mod;
import package_eg.*;
public class Default_AM {
	public static void main(String[] args) {
		// outside package we can not access default method and class
		Default_AM_Test obj = new Default_AM_Test();
		obj.show();
	}

}
