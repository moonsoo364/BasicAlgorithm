package test;

import java.util.Scanner;

public class PrintStars1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,w;
		
		System.out.println("*�� n�� ����ϵ� w������ ���� �ٲ㼭 ����մϴ�.");
		
		do {
			System.out.println("n��:");
			n = sc.nextInt();
			
		}while(n<=0);
	
		do {
			System.out.print("w��: ");
			w = sc.nextInt();
		} while(w <= 0 || w > n);
		
		for(int i = 0; i<n; i++) {
			System.out.print("*");
			if(i % w == w-1) {
				System.out.println();
			}
		if ( n % w != 0) {
			System.out.println();
		}
		}
	}

}
