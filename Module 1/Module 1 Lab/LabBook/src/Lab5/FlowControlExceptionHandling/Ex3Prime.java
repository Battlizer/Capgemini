package Lab5.FlowControlExceptionHandling;

import java.util.Scanner;

public class Ex3Prime {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the integer");
		int n = sc.nextInt();
		System.out.print("The Prime numbers in the range are: ");
		for (int i = 2; i < n; i++) {
			int count = 0;
			for (int j = 2; j <= (i+1)/2; j++) {
				if (i%j == 0) count++;
			}
			
			if(count ==0)System.out.print(i+" ");
		}
		
		sc.close();
	}
}
