public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 48, 72, 13, 14, 15 }, 
						   { 21, 22, 53, 24, 75 },
						   { 31, 57, 33, 34, 35 }, 
						   { 41, 95, 43, 44, 45 },
						   { 59, 52, 53, 54, 55 }, 
						   { 61, 69, 63, 64, 65 } };

		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > maxNumber) {
					maxNumber = matrix[i][j];
				}
				if (matrix[i][j] < minNumber) {
					minNumber = matrix[i][j];
				}
			}

		}
		System.out.print("The smallest number is " + minNumber
				+ "\n The biggest number is " + maxNumber);
	}
}
