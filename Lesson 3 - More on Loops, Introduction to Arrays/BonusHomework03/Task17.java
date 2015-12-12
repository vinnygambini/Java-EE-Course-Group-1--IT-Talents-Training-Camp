import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array's length = ");
		int lenght = input.nextInt();
		int[] array = new int[lenght];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			array[i] = input.nextInt();
		}
		input.close();


		int zigzag = 0;

		for (int i = 0; i <= array.length - 2; i++) {
			if (zigzag == 0) {
				if (array[i] < array[i + 1]) {
					zigzag = 1;

				} else {
					System.out.println("Arrey is not ot zigzag");
					break;
				}
			} else {
				if (array[i] > array[i + 1]) {
					zigzag = 0;
				} else {
					System.out.println("Arrey is not ot zigzag");
					break;
				}
			}

			if (i == array.length-2) {
				System.out.println("Array is zigzag");
			}
		}
	}
}
