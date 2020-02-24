package Lab6.StringIOFormattingAndParsing;

import java.util.Scanner;

public class Ex8PositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.next();
		boolean bool = true;
		for (int i = 1; i < s.length()-1; i++) {
			if(s.charAt(i) - s.charAt(i-1) <= 0)
				bool = false;
		}
		
		if(bool) 
			System.out.println("The String is Positive");
		else 
			System.out.println("The String is Not Positive");
		
		sc.close();
	}
}
