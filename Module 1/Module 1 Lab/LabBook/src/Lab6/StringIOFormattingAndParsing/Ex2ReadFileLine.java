package Lab6.StringIOFormattingAndParsing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex2ReadFileLine {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name/location");
		String fname = sc.nextLine();
		FileInputStream file = new FileInputStream(fname);
		
		int line = 1;
		System.out.println("File contents are as follows:\n" + line + ": ");
		int n = file.available();
		for (int i = 0; i < n; i++) {
			char ch = (char)file.read();
			System.out.print(ch);
			if(ch == '\n')  System.out.println(++line + ": ");
		}
		
		sc.close();
		file.close();
	}
}
