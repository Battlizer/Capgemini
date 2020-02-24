package Lab6.StringIOFormattingAndParsing;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1IntegerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers :");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		int sum =0;
		System.out.println("The integers are :");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			int n = Integer.parseInt(temp);
			System.out.print(" "+n);
		}
		System.out.println("\nThe sum of the integers are :"+sum);
		sc.close();
	}
}
