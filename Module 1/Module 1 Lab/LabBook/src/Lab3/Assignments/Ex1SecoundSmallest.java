package Lab3.Assignments;

import java.util.Scanner;

public class Ex1SecoundSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second Smallest element is : "+getSecondSmallestElement(arr));
	}
	
	public static int getSecondSmallestElement(int[] arr) {
		for (int i = 0; i < arr.length -1; i++) {
			int min = i;
			for(int j =i+1 ; j<arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
			int temp = arr[min];
			arr[min] =arr[i];
			arr[i] = temp;

			System.out.print(arr[i]+ " ");
		}
		return arr[1];
	}
}
