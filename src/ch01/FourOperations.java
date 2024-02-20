package fouroperations;

import java.util.Scanner;

public class FourOperations {
	
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int product(int a, int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a/b;
	}
	static int remain(int a, int b) {
		return a%b;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		System.out.printf("%d\n", plus(a,b));
		System.out.printf("%d\n", minus(a,b));
		System.out.printf("%d\n", product(a,b));
		System.out.printf("%d\n", divide(a,b));
		System.out.printf("%d\n", remain(a,b));
		
	}

}
