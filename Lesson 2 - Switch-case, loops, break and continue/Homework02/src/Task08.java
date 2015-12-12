import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();

		int secondNumber = number - 1;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print(secondNumber);
			}
			System.out.println();
			secondNumber += 2;
		}
	}
}
