package ch03;

import java.util.Scanner;

public class Plus10950 {
	
	public static int plus(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		int testCase = stdIn.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			System.out.println(plus(x,y));
		}
	}

}
