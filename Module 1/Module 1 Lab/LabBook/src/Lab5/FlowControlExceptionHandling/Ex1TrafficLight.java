package Lab5.FlowControlExceptionHandling;

import java.util.Scanner;

public class Ex1TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1)Red \n2)Yellow \n3)Green\n\nEnter your choice :");
		switch(sc.nextInt()) {
		case 1:System.out.println("Stop");
			break;
		case 2:System.out.println("Ready");
			break;
		case 3:System.out.println("Go");
			break;
		default:System.out.println("Invalid input");
		}
		
		sc.close();
	}
}
