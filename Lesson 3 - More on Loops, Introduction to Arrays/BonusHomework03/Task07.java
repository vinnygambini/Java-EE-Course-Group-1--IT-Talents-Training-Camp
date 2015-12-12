import java.util.Arrays;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter  array's length = ");
		int lenght = input.nextInt();
		int[] arr1 = new int[lenght];
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			arr1[i] = input.nextInt();
		}
		System.out.println();
		System.out.println("First array is " + Arrays.toString(arr1));

		for (int i = 1; i <= arr1.length - 2; i++) {
			arr2[0] = arr1[1];
			arr2[arr2.length - 1] = arr1[arr1.length - 1];
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}
		System.out.println("Second array is " + Arrays.toString(arr2));
	}
}
