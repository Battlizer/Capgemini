package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;
import com.SBU;

public class EmployeeSbuMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		SBU sbu = (SBU)ctx.getBean("sbu");
		Employee emp = sbu.findEmpById(12347);
		System.out.println("Employee Info:");
		System.out.println("Employee ID\t:"+emp.getEmployeeId());
		System.out.println("Employee NAME\t:"+emp.getEmployeeName());
		System.out.println("Employee SALARY\t:"+emp.getSalary());
	}

}
