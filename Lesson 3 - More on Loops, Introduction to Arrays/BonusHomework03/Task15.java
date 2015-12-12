import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array's length = ");
		int lenght = input.nextInt();
		double[] Array = new double[lenght];

		for (int i = 0; i < Array.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			Array[i] = input.nextDouble();
		}
		input.close();

		double maxIndex1;
		double maxIndex2;
		double maxIndex3;
		double maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < Array.length; i++) {
			if (Math.abs(Array[i]) > maxValue) {
				maxValue = Array[i];
			}
		}
		maxIndex1 = maxValue;
		maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < Array.length; i++) {
			if (Math.abs(Array[i]) > maxValue && Array[i] != maxIndex1) {
				maxValue = Array[i];
			}
		}
		maxIndex2 = maxValue;
		maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < Array.length; i++) {
			if (Math.abs(Array[i]) > maxValue && Array[i] != maxIndex1
					&& Array[i] != maxIndex2) {
				maxValue = Array[i];
			}
		}
		maxIndex3 = maxValue;
		System.out.println("The largest three elemets in array are " + maxIndex1
				+ " ," + maxIndex2 + " ," + maxIndex3);
	}
}
