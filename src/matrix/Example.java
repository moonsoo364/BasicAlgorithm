package matrix;

public class Example {
	
	static int[][] plusMatrix() {
		
		int[][] matrix1 = {{1,2},{3,4}};
		int[][] matrix2 = {{5,6},{7,8}};
		int[][] result = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < matrix1.length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
		
	}
	static int[][] productMatrix(){
		int[][] matrix1 = {{1,2,3},{4,5,6}};
		int[][] matrix2 = {{7,8},{9,8},{11,12}};
		int[][] result = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2;j++) {
				for(int k = 0; k < 3; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		plusMatrix();
		productMatrix();
		
	}

}
