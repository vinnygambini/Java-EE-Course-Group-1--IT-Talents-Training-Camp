import java.util.Arrays;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// initialise first array

		System.out.print("Enter first array's length = ");
		int fisrtLenght = input.nextInt();
		while (fisrtLenght <= 1) {
			System.out
					.println(" Array's length can not be less then 2 digit.Try again... ");
			fisrtLenght = input.nextInt();
		}
		int[] Array1 = new int[fisrtLenght];
		for (int i = 0; i < Array1.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			Array1[i] = input.nextInt();
		}

		// initialise second array

		System.out.print("Enter second array's length = ");
		int secondLenght = input.nextInt();
		while (secondLenght <= 1) {
			System.out
					.println(" Array's length can not be less then 2 digit.Try again... ");
			secondLenght = input.nextInt();
		}
		int[] Array2 = new int[secondLenght];
		for (int i = 0; i < Array2.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			Array2[i] = input.nextInt();
		}

		// equal check
		boolean isEqual = true;

		if (Array1.length == Array2.length) {
			for (int i = 0; i < Array2.length; i++) {
				if (Array1[i] != Array2[i]) {
					isEqual = false;
					break;
				}
			}
		}

		else {
			isEqual = false;
		}

		if (isEqual) {
			System.out.println("The arrays are equal ");
			System.out.println(Arrays.toString(Array1));
			System.out.println(Arrays.toString(Array2));
		} else if (Array1.length == Array2.length) {
			System.out
					.println("The arrays are not equal but have same length ");
			System.out.println(Arrays.toString(Array1));
			System.out.println(Arrays.toString(Array2));
		} else {
			System.out
					.println("The arrays are not equal and have different length ");
		}

	}
}
