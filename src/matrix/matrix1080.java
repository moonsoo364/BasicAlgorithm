package matrix;

import java.util.Scanner;

public class matrix1080 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int getMatrixSize(int order) {
		int n;
		do {
			System.out.println(order+"번째 정수를 입력해주세요 (50 이하)");
			n = stdIn.nextInt();
			if(n > 50) {
				System.out.println("입력값이 50을 초과했습니다. 다시 입력 하세요");
			}
		}while(n>50);
		
		return n;
	}
	
	static int[][] setMatrix(String type, int n, int m){
		int[][] result = new int[n][m];
		for(int i = 0; i < n; i++) {
			System.out.printf("0 혹은 1을 %d개 입력해주세요.\n",m);
			int number = stdIn.nextInt();
			
			for(int j = m -1; j >=0; j--) {
				result[i][j] =  number % 10;
				number /= 10;
			}
		}
		System.out.printf("%s행렬 할당 종료\n", type);
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("두 정수를 입력해주세요.");
		int n = getMatrixSize(1);
		int m = getMatrixSize(2);
		
		System.out.printf(" n: %d\n m: %d \n", n, m);
		int[][] matrixA = setMatrix("A",n,m);
		int[][] matrixB = setMatrix("B",n,m);
		System.out.printf(" 행렬 지정 끝 \n");
		
	}

}
