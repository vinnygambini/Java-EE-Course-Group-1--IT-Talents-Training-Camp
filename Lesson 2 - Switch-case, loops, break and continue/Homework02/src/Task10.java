import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method nstub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		int number = input.nextInt();

		boolean check = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				check = false;
				break;
			}
		}

		System.out.println("check is " + check);
		if (check) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}

}
