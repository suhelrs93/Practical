package inheritance;
//Problem Statement 1
public class Employee { // parent class
	// instance Variables
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	//instance variables with default value
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	// Parameterized Constructor of parent class
	Employee(long Id, String Name, String address, long phone){
		// initializing instance variables 
		employeeId = Id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}
	double calculateSlary(){ // user defined method
		double salary; //local variable
		// actual logic for calculating salary
		salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100);
		return salary;// Printing Result
	}
	double calculateTransportAllowance(){ // Problem Statement 2
		double transportAllowance = (10*basicSalary)/100; // Default Allowance 10%
		return transportAllowance;
		
	}
}
	// Test Case 1
class Manager extends Employee{ // Child class 1
	// Parameterized Constructor of child class 1
	Manager(long Id, String Name, String address, long phone, double salary) {
		//due to super() method no need to initialize above instance variables
		super(Id, Name, address, phone);
		this.basicSalary = salary; //Initializing instance variable
	}
	double calculateTransportAllowance(){// Problem Statement 2
		double transportAllowance = (15*basicSalary)/100; // Manager Allowance 15%
		return transportAllowance;
	}
}
	// Test case 2
class Trainee extends Employee{ // child class 2
		// Parameterized Constructor of child class 2
		Trainee(long Id, String Name, String address, long phone, double salary) {
			super(Id, Name, address, phone);// no need to initialize above instance variables
			this.basicSalary = salary; //Initializing instance variable
		}
}
	
