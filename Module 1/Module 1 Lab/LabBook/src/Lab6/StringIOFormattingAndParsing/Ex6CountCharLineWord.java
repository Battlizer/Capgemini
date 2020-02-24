package Lab6.StringIOFormattingAndParsing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex6CountCharLineWord {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name/location");
		String fname = sc.nextLine();
		FileInputStream file = new FileInputStream(fname);
		
		int ch = 0, word = 0, line = 0;
		ch = file.available();
		for (int i = 0; i < ch; i++) {
			char c = (char)file.read();
			if(c == '\n') 
				line++;
			else if(c ==' ')
				word++;
		}
		System.out.println("Number of lines : "+ line +"\nNumber of words: "+ (word+line+1) +"\nNumber of characters: "+ch);
		
		file.close();
		sc.close();
	}
}
