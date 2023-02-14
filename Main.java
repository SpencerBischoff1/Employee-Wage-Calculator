import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Main {
	
	String employeeID;
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> employee = new ArrayList<Employee>();
		String employeeID = null;
		int employeeSalary;
		int employeeType = 0;
		
		
		for (int i=0; i<4; i++) {
			System.out.println("Enter employeeID of an employee?");
			employeeID = input.nextLine();
			
			System.out.println("Enter salary of the employee");
			employeeSalary = input.nextInt();
			
			System.out.println("Is this employee a manager or worker? (Enter 1 for worker and 2 for manager");
			employeeType = input.nextInt();
			
			
			
		
		
		if(employeeType == 1) 
		{
			employee.add(new WorkerEmployee(employeeID, employeeSalary));
		}
		else
		{
			employee.add(new ManagerEmployee(employeeID, employeeSalary));
		}
		input.nextLine();
		} // for loop
		
		
		
		System.out.println("A file named output.txt was created with pay information.");

		String line = "";
		if(line == employeeID) {
		String lineRead = line;
		BufferedReader reader = null;
		
		// Read the input.txt, tested and works 
		
		 try
		 {
		 reader = new BufferedReader(new FileReader("Input.txt"));
		line = reader.readLine();
		 while (line != null)
		{
		 System.out.println(line);
		 line = reader.readLine();
		 }
		 }
		 catch (IOException e)
		 {
		 System.out.println(e.getMessage());
		 }
		 finally
		 {
		 try
		 {
		 if (reader != null)
		 reader.close();
		 }
		 catch (IOException e)
		 {
		 System.out.println(e.getMessage());
		 }//catch
		 }//finally
		} // if
		else {
			System.out.print("Wrong employee ID.");
		} 	
		
	//Write the output.txt file
		
	FileWriter output = new FileWriter(new File("output.txt"));
	String text =( " ");
	
	for(Employee empl : employee) {
		text = text + empl.printMessage() + "\n";
	}//for
	
	output.write(text);
	output.close();
	}//main
	
}//class
	
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// if statement goes here for determining if employee is worker or manager
		
		
		
		
		/*for(int i = 0; i < 4; i++) {
			if (i > 4){
		// Testing to see if I could use multiple ArrayLists 
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		
		System.out.println("Enter employee ID of an employee?");
		if(employeeType == 1)
		Scanner input = new Scanner(System.in);
		
		
		// if verify status 1 or 2
		 
			} // end of i>4 loop 
		System.out.println("Enter salary of the employee?");
		
		
		//double employeeSalary = input.nextDouble();
		//employeeSalary.add(input.nextDouble());
		
		System.out.println("Is this employee a manager or worker? (Enter 1 for worker and 2 for manager)");
		
		
		//int employeeType = input.nextInt();
		//employeeType.add(input.nextInt());
	// If statement for status 
		 employee.add(new WorkerEmployee(employeeID, employeeSalary, employeeType);
		
		} // end of for loop 
		
		
		
		
		
		
		
		
		
		//take this line out of the loop so you can print it after the employees are added
		System.out.println("A file names output.txt was created with pay information");
	
	// Testing the Array List 
		
		System.out.println(employee);
		
		
		
		
		
		
		
		// need reader line 
		
		
		
		// need writter line */
	
	// end of main 

