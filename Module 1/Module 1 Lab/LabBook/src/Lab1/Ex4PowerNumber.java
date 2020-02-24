package Lab1;
import java.util.Scanner;

public class Ex4PowerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		boolean flag =false;
		int num = sc.nextInt();
		for(int i=1; i<= num; i*=2) {
			if(i == num) {
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("It is a power of 2");
		else System.out.println("It is not a power of 2");
	}
}
