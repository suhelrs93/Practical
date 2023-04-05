package constructor;

public class Const_Overload {
	int age;
	String name;
	String address;
	// Constructor 1 with 2 argument
	Const_Overload(int a, String n){
		age=a;
		name=n;
	}
	// Constructor 2 with 3 argument
	Const_Overload(int a, String n, String ad){
		age=a;
		name=n;
		address=ad;
	}
	public void show() {
		System.out.println("Name="+name+" Age="+age+" Address="+address);
	}
	public static void main(String[] args) {
		Const_Overload ob=new Const_Overload(25,"Asif");
		Const_Overload ob2=new Const_Overload(30,"Arnav","Hydrabad");
		ob.show();
		ob2.show();
	}

}
