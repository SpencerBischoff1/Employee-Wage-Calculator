
public class WorkerEmployee extends Employee{

	int payCheck;
	
	
	WorkerEmployee(String newEmployeeID, int newEmployeeSalary) {
		super(newEmployeeID, newEmployeeSalary);
		
	} // end of constructor
	
	
	public int calculatePaycheck() {
		int pay = (((newEmployeeSalary/12)- 100));
		return pay;
	}
	
}
	
	
//end of class


// In this class well set up the constructor and math for worker paycheck
