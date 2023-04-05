package constructor;

public class ParameterizedCons {
	int age;
	String name;
	// parameterized cons where we have to pass the parameter / arguments
	ParameterizedCons(int a, String n){
		age = a;
		name = n;
	}
	void show() {
		System.out.println(age+ " "+name);
	}
	public static void main(String[] args) {
		ParameterizedCons d=new ParameterizedCons(20, "Vivek");
		ParameterizedCons d1=new ParameterizedCons(25, "Suhel");
		ParameterizedCons d2=new ParameterizedCons(21, "Zoha");
		d.show();
		d1.show();
		d2.show();
		
	}

}
