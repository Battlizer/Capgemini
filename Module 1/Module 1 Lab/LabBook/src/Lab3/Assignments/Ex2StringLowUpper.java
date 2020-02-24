package Lab3.Assignments;

import java.util.Scanner;

public class Ex2StringLowUpper {

	public static void alphaOrder(String []s) {
		for (int i = 0; i < s.length-1; i++) {
			int temp=i;
			for (int j = i+1; j < s.length; j++) {
				if(s[temp].compareTo(s[j]) < 0)
						temp =j;
			}
			String str = s[i];
			s[i] = s[temp];
			s[temp] = str;
		}
		for (int i = 0; i < (s.length+1)/2; i++) {
			s[i] = s[i].toUpperCase();
		}
		for(int i = (s.length+1)/2 ; i <s.length; i++) {
			s[i] = s[i].toLowerCase();
		}
		//return s;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the range: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the Strings in the array:");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		System.out.println("The String array after sorting :");
		alphaOrder(s);
		for (int j = 0; j < s.length; j++) {
			System.out.print(s[j]+ " ");
		}
	}
}
