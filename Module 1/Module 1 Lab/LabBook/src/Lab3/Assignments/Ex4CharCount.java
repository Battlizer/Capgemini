package Lab3.Assignments;

import java.util.Scanner;

public class Ex4CharCount {

	public static void charCount(char c[]) {
		
		for (int i = 0; i < c.length-1; i++) {
			if(c[i] != '$') {
				int count = 1;
				for (int j = i+1; j < c.length; j++) {
					if(c[i] == c[j]) {
						count ++;
						c[j] = '$';
					}
				}
				System.out.println(c[i]+ " -->"+count + " Times");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters");
		int n = sc.nextInt();
		System.out.println("Enter the character array");
		char c[] = new char[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		
		System.out.println("The number of times each character is present in array are:");
		charCount(c);
	}
}
