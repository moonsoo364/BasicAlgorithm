package ch02;

import java.util.Scanner;

public class AlarmTimer {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int h = stdIn.nextInt();
		int m = stdIn.nextInt();
		int BACK_MIN = 45;
		int alarmMin = m - BACK_MIN;
		
		if((alarmMin) < 0) {
			h = h-1;
			if(h == -1) {
				h = 23;
			}
			alarmMin = 60 + alarmMin;
		}
		System.out.printf("%d %d", h,alarmMin);
	}
}
