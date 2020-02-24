package Lab5.FlowControlExceptionHandling;

import java.util.Scanner;

class UserAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserAgeException(String msg) {
		super(msg);
	}
}

public class Ex5ValidateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the age of the person");
			int age = sc.nextInt();
			if(age<16) throw new UserAgeException("The user's age is not valid.");
			
			System.out.println(age+" is a valid age for the user");
		}catch(UserAgeException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
