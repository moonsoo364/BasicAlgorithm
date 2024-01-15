package test;

import java.util.Scanner;

public class SumVerbose1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n=stdIn.nextInt();
		}while(n<=0);
		int sum=0;
		for(int i=1;i<n;i++) {
			System.out.print(i+"+");
			sum+=1;
		}
		System.out.print(n+"=");
		System.out.print(sum);
	}

}
