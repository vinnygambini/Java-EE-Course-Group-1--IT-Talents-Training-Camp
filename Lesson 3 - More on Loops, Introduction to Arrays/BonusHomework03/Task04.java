import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array's length = ");
		int lenght = input.nextInt();
		while (lenght <= 1) {
			System.out
					.println(" Array's length can not be less then 2 digit.Try again... ");
			lenght = input.nextInt();
		}
		int[] Array = new int[lenght];
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Enter index " + (i + 1));
			Array[i] = input.nextInt();
		}
		input.close();
		
		boolean isMirrored = true;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] != (Array.length - 1 - i)) {
				isMirrored = false;
				break;
			}

			if (isMirrored) {
				System.out.println("The array is mirrored");
			} else {
				System.out.println("The array isn't mirrored");
			}
		}
	}

}
