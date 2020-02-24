package Lab5.FlowControlExceptionHandling;

import java.util.Scanner;

public class Ex2Fibonacci {

	private static int recFibo(int n) {
		if(n <= 1) return n;
		else 
		return recFibo(n-1)+recFibo(n-2);
	}
	
	private static int fibo(int n) {
		int a=1,b=1,c=0;
		for (int i = 2; i < n; i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		
		System.out.println("Recursive function nth value "+recFibo(n));
		
		System.out.println("Non Rrecursive function nth value "+fibo(n));
		
		sc.close();
	}
}
