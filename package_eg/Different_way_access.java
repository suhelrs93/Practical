package package_eg;
//1. import package,*;
//2. import package.Classname;
//3. fully qualified name.
import com.newcom.MyPackage;//sub package
public class Different_way_access {
	public static void main(String[] args) {
		MyPackage obj = new MyPackage();
		obj.display();
	}

}
