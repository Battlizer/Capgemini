package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;
import com.SBU;

public class EmployeeSbuMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		SBU sbu = (SBU)ctx.getBean("sbu");
		sbu.printSbuDetails();

	}

}
