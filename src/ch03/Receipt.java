package ch03;

import java.util.Scanner;

public class Receipt {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int totalPrice = stdIn.nextInt();
		int numberOfItem = stdIn.nextInt();
		int inputPrice = 0;
		int i = 0;
		
		do {
			int itemPrice = stdIn.nextInt();
			int itemCount = stdIn.nextInt();
			
			inputPrice += itemPrice * itemCount;
			i++;
		}while(i < numberOfItem);
		
		if(totalPrice == inputPrice) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
