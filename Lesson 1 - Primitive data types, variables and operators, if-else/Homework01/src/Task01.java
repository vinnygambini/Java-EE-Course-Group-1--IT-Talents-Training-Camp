import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter two floating point numbers a and b: ");
		System.out.print("a= ");
		double a = input.nextDouble();
		System.out.print("b= ");
		double b = input.nextDouble();
		System.out.print("c= ");
		double c = input.nextDouble();

		if (a < c && c < b) {
			System.out.println("The number " + c + " is between " + a + " and "
					+ b);
		}
		else {
			System.out.println("The number " + c + " isn't between " + a + " and "
					+ b);
		}

	}
}