import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int sum = 0;
		double averageValue = 0;
		int[] Array = new int[7];

		for (int i = 0; i < Array.length; i++) {
			System.out.print("Enter index " + (i + 1)+" =");
			Array[i] = input.nextInt();
		}
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
			averageValue = sum / 7;
		}

		int difference = 0;
		double minDifference = Integer.MAX_VALUE;
		int closestValue = 0;
		for (int i = 0; i < Array.length; i++) {
			difference = (int) Math.abs(averageValue - Array[i]);
			if (difference < minDifference) {
				minDifference = difference;
				closestValue = Array[i];
			}
		}
		System.out.println("The averge value is "+averageValue+" Yhe closest to average value is "+closestValue);
	}
}
