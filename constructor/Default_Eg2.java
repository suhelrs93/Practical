// we are not creating any constructor so compiler provides us default cons
// 0 & null values provides by default constructor
package constructor;

public class Default_Eg2 {
	int Sl_no;
	String Name;
	void result() {
		System.out.println(Sl_no+" "+Name);
	}
	public static void main(String[] args) {
		
		Default_Eg2 obj = new Default_Eg2();
		
		System.out.println(obj.Sl_no+" "+obj.Name);
	}

}
