package Lab4.Operators;

import java.util.Scanner;

public class EX1DigitCubeSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		System.out.println("The Sum of digit cubes of the number is "+digitCubeSum(n));
		
		sc.close();
	}

	private static int digitCubeSum(int n) {
		int cubeSum = 0;
		while(n>0) {
			cubeSum += Math.pow(n%10, 3);  
			n/=10;
		}
		
		return cubeSum;
	}
}
