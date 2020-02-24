package Lab10.LambdaExp;

import java.util.Scanner;

interface StringFormat{
	String strFormat(String s);
}

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the string without spaces :");
		//String s = sc.next();
		StringFormat sf = (st) -> 
			{
				for(int i=0;i<st.length();i++) {
					st= st.substring(0, i)+" "+ st.substring(i); 
				}
				return st;
			};
		System.out.println("The formatted String is "+ sf.strFormat("Prashant"));
	}
}
