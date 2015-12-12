public class Task02 {

	public static void main(String[] args) {

		int[] firstArray = { 2, 4, 6, 8, 10, 12, 14 };
		int[] secondArray;

		System.out.println("The original array is ");
		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + ", ");

		}
		if (firstArray.length % 2 == 0) {
			secondArray = new int[firstArray.length];
			for (int i = 0; i < firstArray.length / 2; i++) {
				secondArray[i] = firstArray[i];
			}
			for (int j = secondArray.length / 2 - 1, k = secondArray.length / 2; j >= 0; j--, k++) {
				secondArray[k] = secondArray[j];
			}
		} else {
			secondArray = new int[firstArray.length + 1];
			for (int i = 0; i < secondArray.length / 2; i++) {
				secondArray[i] = firstArray[i];
			}
			for (int j = secondArray.length / 2 - 1, k = secondArray.length / 2; j >= 0; j--, k++) {
				secondArray[k] = secondArray[j];
			}
		}
		System.out.println("Thw second array is");
		for (int i = 0; i < secondArray.length; i++) {
			if (i == secondArray.length - 1) {
				System.out.print(secondArray[i]);
			} else {

				System.out.print(secondArray[i] + ", ");
			}
		}

	}
}