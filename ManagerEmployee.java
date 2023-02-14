
public class ManagerEmployee extends Employee{

	int payCheck;
	
	ManagerEmployee(String newEmployeeID, int newEmployeeSalary) {
		super(newEmployeeID, newEmployeeSalary);
		} // end of constructor
	
	
	public int calculatePayCheck() {
		int pay = (newEmployeeSalary/12);
		int paid = (int) ((pay*.2) + pay);
		return pay;
	}
}// end of class



// In this class, well set up the constructor and the math for our manager paychecks