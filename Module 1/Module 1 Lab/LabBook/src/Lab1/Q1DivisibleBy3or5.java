package Lab1;
import java.util.Scanner;

public class Q1DivisibleBy3or5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println("The Sum = "+ calculateSum(n));
	}
	
	static int calculateSum(int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
