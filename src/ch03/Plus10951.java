package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus10951 {
	
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			
			String line;
			try {
				line = bf.readLine();
				if(line == null || line.equals(""))
					break;
				String[] split = line.split(" ");
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				System.out.println(a+b);
			} catch (IOException e) {
				break;
			}

		}
	}

}
