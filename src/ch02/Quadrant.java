package ch02;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}else if(x < 0 && y > 0) {
			System.out.println("2");
		}else if(x < 0 && y < 0){
			System.out.println("3");
		}else if(x > 0 && y < 0) {
			System.out.println("4");
		}
	}
}
