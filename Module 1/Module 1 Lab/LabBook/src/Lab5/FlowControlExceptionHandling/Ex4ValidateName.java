package Lab5.FlowControlExceptionHandling;

import java.util.Scanner;

class FirstNameEmptyException extends Exception{
	public FirstNameEmptyException(String msg) {
		super(msg);
	}
}

class LastNameEmptyException extends Exception{
	public LastNameEmptyException(String msg) {
		super(msg);
	}
}

public class Ex4ValidateName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter the first name");
		
		String first = "Prashant";//sc.next();
		sc.nextLine();
		System.out.println("Enter the middle name");
		String middle = sc.next();
		sc.nextLine();
		System.out.println("Enter the middle name");
		String last = "";//sc.next();
		if(first == "" )
			throw new FirstNameEmptyException("First name is empty");
		if(last == "" )
			throw new LastNameEmptyException("Last name is empty");

		System.out.println(first+" "+middle+" "+last);
		
		}catch (FirstNameEmptyException e) {
			e.printStackTrace();
		}
		catch (LastNameEmptyException e) {
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
	}
}
