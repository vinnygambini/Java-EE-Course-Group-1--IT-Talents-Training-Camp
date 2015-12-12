import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = input.nextInt();

		int number = 1;
		int sum = 1;
		System.out.print("The sum 1");
		while (number < a) {
			number++;
			sum += number;
			System.out.print(" + " + number);
		}
		System.out.println(" = " + sum);
	}
}
