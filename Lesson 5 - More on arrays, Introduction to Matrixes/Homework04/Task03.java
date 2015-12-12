public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] matrix = { { 1, 2, 3, 4 }, 
							  { 5, 6, 7, 8 },
							  { 9, 10, 11, 12 }, 
							  { 13, 14, 15, 16 } };

		double sum = 0;
		double average = 0;
		int counter = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
				counter++;
			}
		}
		average = (double) sum / counter;

		System.out.println("The sum of elements of the array is " + sum);
		System.out.println("The average elements of the array is " + average);
	}

}
