package constructor;

public class BothCons {
	int age;
	String name;
	
	BothCons(){ // default cons
		System.out.println("Employee age and Names are shown Below:");
	}
	BothCons(int a, String n){
		age = a;
		name = n;
	}
	void show() {
		System.out.println(age+ " "+name);
	}
	public static void main(String[] args) {
		BothCons E5=new BothCons();
		BothCons E=new BothCons(24, "Suhel");
		BothCons E1=new BothCons(25, "Akshay");
		BothCons E2=new BothCons(23, "Zoha");
		BothCons E3=new BothCons(22, "Yogesh");
		BothCons E4=new BothCons(21, "Tushar");
		E.show();
		E1.show();
		E2.show();
		E3.show();
		E4.show();
	}

}
