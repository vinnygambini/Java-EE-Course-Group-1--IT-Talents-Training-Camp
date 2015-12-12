import java.util.Arrays;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] Array2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] Array3 = new int[Array1.length];

		for (int i = 0; i < Array1.length; i++) {
			if (Array1[i] > Array2[i]) {
				Array3[i] = Array1[i];
			} else if (Array2[i] > Array1[i]) {
				Array3[i] = Array2[i];
			}

		}
		System.out.println("First array is " + Arrays.toString(Array1));
		System.out.println();
		System.out.println("Second array is " + Arrays.toString(Array2));
		System.out.println();
		System.out.println("Third array is " + Arrays.toString(Array3));

	}
}
