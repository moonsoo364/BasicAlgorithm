package leapyear;

import java.util.Scanner;

public class LeapYear {

	static Scanner stdIn = new Scanner(System.in); 
	public static void main(String[] args) {
		int year = stdIn.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.printf("%d", 1);
		}else {
			System.out.printf("%d", 0);
		}
	}
}
