package super_keyword;
/* super keyword -- reference variable which refer immediate parent class object
 * (Iv,method,con)
 * 3 usage of super keyword
 * 1--- refer immediate parent class constructor
 */

class Shape2 { //parent class
	//Default constructor of parent class
	Shape2(){
		System.out.println("hello");
	}
}
class Size2 extends Shape2{ // child class
	//Default constructor of the child class
	Size2(){
		// invoke immediate parent class constructor line no 10
		System.out.println("hi");
	}
}
public class SuperCons {
	public static void main(String[] args) {
		Size2 obj=new Size2();// creating obj of child class
		
	}

}
/* Super() is added in each class constructor automatically by compiler if there
 *  is no super()*/
