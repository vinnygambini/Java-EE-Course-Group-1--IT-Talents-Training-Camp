import java.util.Arrays;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] Array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341,
				1.2 };
		int counter = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] <= 2.99 && Array[i] >= -2.99) {
				counter++;
			}

		}
		double[] array2 = new double[counter];
		for (int i = 0, j = 0; i < Array.length; i++) {
			if (Array[i] <= 2.99 && Array[i] >= -2.99) {
				array2[j] = Array[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(array2));
	}

}
