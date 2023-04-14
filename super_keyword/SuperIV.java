package super_keyword;
/* super keyword -- reference variable which refer immediate parent class object
 * (Iv,method,con)
 * 3 usage of super keyword
 * 2--- by using super keyword we can use parent class data member
 */

class Shape { //parent class
	String name="circle";// data member of parent class
}

class Size extends Shape{ // child class
	String name="No Size";// data member of child class
	void print(){// child class method
		System.out.println(name);// it represent child class
		// it represent immediate parent class IV
		System.out.println(super.name);
	}
}
public class SuperIV {
	public static void main(String[] args) {
		Size obj=new Size();// creating obj of child class
		obj.print();
	}

}
