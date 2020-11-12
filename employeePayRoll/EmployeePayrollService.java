package employeePayRoll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
	
	public EmployeePayrollService() {}
	
	public ArrayList <EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollServiece = new EmployeePayrollService(employeePayrollList);
		Scanner consoleReader = new Scanner(System.in);
		
		employeePayrollServiece.readEmployeePayroleData(consoleReader);
		employeePayrollServiece.writeEmployeePayrollData();
	}

	private void readEmployeePayroleData(Scanner consoleReader) {
		
		System.out.print("Id : ");
		Integer id = consoleReader.nextInt();
		System.out.print("Name : ");
		String name = consoleReader.next();
		System.out.print("Salary : ");
		Double salary = consoleReader.nextDouble();
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(id, name, salary);
		employeePayrollList.add(employeePayrollData);
	}
	
	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll in Console\n" + employeePayrollList);
	}
}
