package inheritance;

//import inheritance.Manager.Trainee;

public class InheritanceActivity { // main class
	public static void main(String[] args) {// main method
		// passing arguments to constructor by creating object of class
		// Test Case 1
		Manager m = new Manager(126534, "Peter", "Chennai, India", 237844, 65000);
		double managerSal= m.calculateSlary();
		System.out.println("Manager Salary = "+ managerSal);//calling method of parent class
		double managerTA=m.calculateTransportAllowance();
		System.out.println("Manager Transport Allowance ="+managerTA);
		System.out.println("Updated Slary of Manager = "+(managerSal+managerTA));// Problem Statement 2
		// Test Case 2
		Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		double traineeSal=t.calculateSlary();//calling method of parent class
		System.out.println("\nTrainee Salary = "+traineeSal);
		double traineeTA=t.calculateTransportAllowance();
		System.out.println("Trainee Transport Allowance ="+traineeTA);
		System.out.println("Updated Slary of Trainee = "+(traineeSal+traineeTA)); // Problem Statement 2
		
	}
}
