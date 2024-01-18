package loop;

import java.util.Scanner;

public class PrintStar_2 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int line = stdIn.nextInt();
		int i = 0;
		
		do {
			for(int j = 0; j < line-i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}while(i<line);
	}

}
