import java.util.Arrays;

public class Task09_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int length = array.length;

		int[] reversedArr = new int[length];

		for (int i = 0; i < length; i++) {
			reversedArr[length - i - 1] = array[i];
		}
		// Print the reversed array
		System.out.println(Arrays.toString(reversedArr));
	}

}
