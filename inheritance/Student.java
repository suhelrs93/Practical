package inheritance;
// add is a reference entity of a class
public class Student {
	int SudId;
	String SudName;
	Address add;//Aggregation
	Student(int SudId, String SudName, Address add){
		this.SudId=SudId;
		this.SudName=SudName;
		this.add=add;
	
	}
	void show() {
	System.out.println(SudId+" "+SudName);
System.out.println(add.City+" "+add.Dist+" "+add.country);	
	}
}
