package Lab7.CollectionAndGenerics;

import java.util.Arrays;

public class Exercise5 {
	static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}	

	public static void main(String[] args) {
		int arr[]= {23,241,4,56};
		int x=getSecondSmallest(arr);
		System.out.println(x);
	}

}