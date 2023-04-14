package polymorphism.method_overriding;

public class Employee {// parent class
	void IncrementSlary(double salary) { // same name method in parent class
		System.out.println("Employee:\nBasic Salary = "+salary);
		salary += (10*salary)/100;
		System.out.println("Updated Salary after Incrementing by 10% : "+salary);
	}
	
	public static void main(String[] args) { // main method
		// Creating a objects
		Employee e = new Employee();
		Developer  d= new Developer();
		Manager m = new Manager();
		// calling same name method with object of different classes
		e.IncrementSlary(65000);
		d.IncrementSlary(45000);
		m.IncrementSlary(55000);
	}
}
class Developer extends Employee{ // child class 1
	void IncrementSlary(double salary) { // same name method in child class 1
		System.out.println("\nDeveloper:\nBasic Salary = "+salary);
		salary += (2*salary)/100;
		System.out.println("Updated Salary after Incrementing by 2% : "+salary);
	}
}
class Manager extends Employee{ // child class 2
	void IncrementSlary(double salary) { // same name method in child class 2
		System.out.println("\nManager:\nBasic Salary = "+salary);
		salary += (5*salary)/100;
		System.out.println("Updated Salary after Incrementing by 5% : "+salary);
	}
}
