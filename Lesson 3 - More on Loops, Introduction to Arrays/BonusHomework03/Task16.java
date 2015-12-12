import java.util.Arrays;
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] Array = new double[10];

		for (int i = 0; i < Array.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			Array[i] = input.nextDouble();
		}
		input.close();

		System.out.println(Arrays.toString(Array));

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] < -0.231) {
				Array[i] = Math.pow(i, 2) + 41.25;
			} else {
				Array[i] = Array[i] * i;
			}
		}

		double[] Array2 = new double[Array.length];
		for (int i = 0; i < Array2.length; i++) {
			Array2[i] = Array[i];
		}
		System.out.println(Arrays.toString(Array2));

		int counter = 0;
		double average = 0;
		for (int i = 0; i < Array2.length; i++) {
			if (Array[i] != 0) {
				average += i;
				counter++;
			}
		}
		System.out.println("Avegage value of the elements without 0 is"
				+ (average / counter));
	}
}
