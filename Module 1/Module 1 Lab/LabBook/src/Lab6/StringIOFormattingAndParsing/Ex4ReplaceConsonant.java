package Lab6.StringIOFormattingAndParsing;

import java.util.Scanner;

public class Ex4ReplaceConsonant {

	static String alterString(String str) {
		//StringBuffer sb = new StringBuffer(s);
		char[] s = str.toCharArray();
		for(int i=0; i<s.length; i++) {
			char c = s[i];
			if((c>='a' && c<='z') || (c>='A' && c<='Z') &&(c!='a' || c!='e' || c!='i' || c!='o' || c!='u')) {
				s[i] = (char) (s[i] + 1);
			}
		}
		
		return String.valueOf(s);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.next();
		
		System.out.println(s);
		
		sc.close();
	}
}
