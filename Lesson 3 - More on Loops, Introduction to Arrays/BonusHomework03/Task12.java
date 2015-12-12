import java.util.Arrays;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int number = array[0];
		array[0] = array[1];
		array[1] = number;

		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];

		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		System.out.println(Arrays.toString(array));
	}
}
