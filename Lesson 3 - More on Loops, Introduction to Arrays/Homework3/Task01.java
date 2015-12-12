import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[7];
		Scanner input = new Scanner(System.in);
		int number = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter array number "+(i+1)+":");
			array[i] = input.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (array[i] < number) {
					number = array[i];
				}
			}
		}

		System.out.println("The smallest number in array devidable by 3 is "
				+ number);
	}

}
