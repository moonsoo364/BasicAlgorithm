package ch02;

import java.util.Scanner;

public class ThreeDice {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int first = stdIn.nextInt();
		int second = stdIn.nextInt();
		int third = stdIn.nextInt();
		
		int BIG = 10000;
		int MEDIUM = 1000;
		int SMALL = 100;
		
		boolean fEqS = first == second;
		boolean fEqT = first == third;
		boolean sEqT = second == third;
		
		boolean fNeS = first != second;
		boolean fNeT = first != third;
		boolean sNeT = second != third;
		
		boolean fGtS = first > second;
		boolean fGtT = first > third;
		
		boolean sGtF = second > first;
		boolean sGtT = second > third;
		
		boolean tGtF = third > first;
		boolean tGtS = third > second;
		
		int price = 0;
		
		if(fEqS && fEqT && fEqT) {
			price = BIG+first*MEDIUM;
		}else if(fEqS && sNeT) {
			price = MEDIUM+first*SMALL;
		}else if(fEqT && sNeT) {
			price = MEDIUM+first*SMALL;
		}else if(sEqT && fNeT) {
			price = MEDIUM+second*SMALL;
		}else {
			if(fGtS && fGtT) {
				price = first*SMALL;
			}else if(sGtF && sGtT) {
				price = second*SMALL;
			}else if(tGtF && tGtS){
				price = third*SMALL;
			}
		}
		System.out.printf("%d",price);
	}

}
