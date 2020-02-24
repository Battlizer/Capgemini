package Lab5.FlowControlExceptionHandling;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Ex6EmployeeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the employee name");
			String name = sc.next();
			System.out.println("Enter the salary");
			float sal = sc.nextFloat();
			if(sal < 3000) throw new EmployeeException("Employee salary entered is below 3000");
			System.out.println("Employee details :\t name: "+name+"\t salary: "+sal);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}
}
