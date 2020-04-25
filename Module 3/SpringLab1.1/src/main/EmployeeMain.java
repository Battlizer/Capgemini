package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		Employee emp = (Employee)ctx.getBean("e");
		emp.printEmployeeDetails();
	}

}
