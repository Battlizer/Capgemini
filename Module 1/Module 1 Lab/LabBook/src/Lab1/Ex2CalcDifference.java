package Lab1;
import java.util.Scanner;

public class Ex2CalcDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int res = calculateDifference(sc.nextInt());
		System.out.println("The Difference is = "+res);
	}
	
	static int calculateDifference(int n) {
		return ((n*(n+1)*(2*n+1)/6) - (int)Math.pow((n*(n+1)/2),2));
	}
}
