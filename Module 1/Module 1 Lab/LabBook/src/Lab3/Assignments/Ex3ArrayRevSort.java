package Lab3.Assignments;

import java.util.Scanner;

public class Ex3ArrayRevSort {

	public static int[] getSorted(int []a) {
		
		for (int i = 0; i < a.length; i++) {
			int t = a[i];
			a[i] = 0;
				
			while(t>0) {
				a[i] = a[i]*10 + t%10;
				t/=10;
			}
		}
		
		for (int i = 0; i < a.length-1; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) min =j;
			}
			int t = a[min];
			a[min] = a[i];
			a[i]= t;
			
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the int array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		a = getSorted(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
