package Lab6.StringIOFormattingAndParsing;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex9DateInfo {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date in the format yyyy-mm-dd");
		LocalDate d = LocalDate.parse(sc.next());
		LocalDate cd = LocalDate.now();
		Period diff = Period.between(d, cd);
		 
	    System.out.printf("Difference is "+diff.getYears()+" years, "+diff.getMonths()+" months and "+diff.getDays()+"days ");
	   
		sc.close();
	}
}
