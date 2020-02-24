package Lab1;
import java.util.Scanner;
public class Ex3IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		if(checkNumber(sc.nextInt()) == true)
			System.out.println("Yes, It is a Increasing Number");
		else System.out.println("No, It is not an Increasing Number");
	}
	
	public static boolean checkNumber(int num) {
		while(num>0) {
			int a = num%10;
			num /= 10;
			if(num>0) {
				if((num%10) >= a) 
					return false;
				num /= 10;
			}
		}
		
		return true;
	}
}
