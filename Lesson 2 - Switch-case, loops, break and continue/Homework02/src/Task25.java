import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number a= ");
		int a = input.nextInt();
		int b = a;
		while (a <= 0) {
			System.out.println("Invalid number.Enter a new number");
			a = input.nextInt();
		}

		int fact = 1;

		do {
			fact *= a;
			a--;

		} while (a > 0);
		System.out.println(b + "! factorial is " + fact);

	}

}
