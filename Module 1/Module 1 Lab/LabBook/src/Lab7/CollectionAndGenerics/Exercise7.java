package Lab7.CollectionAndGenerics;

import java.util.Arrays;

public class Exercise7 {
	static int[] getSorted(int[] arr) {
		int x[]=new int[arr.length];
		//String p[]=new String[arr.length];
		String s=Arrays.toString(arr);
		System.out.println(s);
		//int j=0;
		
		StringBuffer st = new StringBuffer(s);  
		for(int i=0;i<arr.length;i++) {
			st=st.reverse();
			//	System.out.println(st);
			//st.toString();
			//System.out.println(st);
			Integer.parseInt(st.toString()) ;
			//	j++;
		}
		
		Arrays.sort(x);
		return x;
	}
	
	public static void main(String[] args) {
		int x[]= {12,45,87};
		System.out.println(getSorted(x));
	}
}