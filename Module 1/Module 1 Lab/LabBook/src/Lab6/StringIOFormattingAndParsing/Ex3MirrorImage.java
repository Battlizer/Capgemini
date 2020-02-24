package Lab6.StringIOFormattingAndParsing;

import java.util.Scanner;

public class Ex3MirrorImage {

	static String getImage(String s) {
		StringBuffer sb = new StringBuffer(s);
		return s.concat("|"+sb.reverse());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		
		System.out.println(getImage(s));
		
		sc.close();
	}
}
