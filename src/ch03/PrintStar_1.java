package ch03;

import java.util.Scanner;

public class PrintStar_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int line = stdIn.nextInt();
		int i = 0;
		
		do {
			for(int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
			i++;
		}while(i<line);
		
	}
}
