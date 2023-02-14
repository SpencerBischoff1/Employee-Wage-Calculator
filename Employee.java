
public class Employee {
	
	protected final String newEmployeeID;
	protected final int newEmployeeSalary;
	
	
	public Employee(String ID, int Salary) {
		newEmployeeID = ID;
		newEmployeeSalary = Salary;
	}

	
	//Getters and setters here
	
	public String getemployeeID() {
		return newEmployeeID;
	}
	
	public int getSalary() {
		return newEmployeeSalary;
	}
	
	public int calculatePaycheck(){
		return 0;
	}
	
	public String printMessage() {
		return newEmployeeID + " earn $" + calculatePaycheck() + " per paid period";
	}


// end of Employee class
}