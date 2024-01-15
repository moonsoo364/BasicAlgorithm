package test;

import java.util.Scanner;

public class Alternative1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("n°ª : ");
		n = sc.nextInt();
		
		for(int i = 0;i<n/2;i++) {
			System.out.print("+-");
			
		}
		if(n%2 != 0) {
			System.out.print("+");
		}
	}

}
