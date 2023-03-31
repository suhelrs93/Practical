package access_mod;
import package_eg.Default_Eg_Test;
public class Default_Eg {
	public static void main(String[] args) {
		// outside package we can not access default method and class
		Default_Eg_Test obj = new Default_Eg_Test();
		obj.show();
	}
}
