package Lab10.LambdaExp;

import java.util.Scanner;

interface Calculator{
	public int calc(int a, int b);
}

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number a and power b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator c = (i,j) -> (int)Math.pow(i, j);
 		System.out.println("The result is "+c.calc(a,b));
	}
}
