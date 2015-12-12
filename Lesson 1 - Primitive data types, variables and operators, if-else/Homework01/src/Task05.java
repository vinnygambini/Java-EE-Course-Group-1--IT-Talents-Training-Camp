import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter three real numbers a,b and c: ");
		System.out.print("a= ");
		double a = input.nextDouble();
		System.out.print("b= ");
		double b = input.nextDouble();
		System.out.print("c= ");
		double c = input.nextDouble();

		if (a >= b && a > c) {
			if (b >= c) {
				System.out.println("The number in descending order are " + a
						+ "  " + b + " " + c);
			} else {
				System.out.println("The number in descending order are " + a
						+ "  " + c + "  " + b);
			}
		}

		if (b > a && b > c) {

			if (a >= c) {
				System.out.println("The number in descending order are " + b
						+ "  " + c + " " + a);
			} else {
				System.out.println("The number in descending order are " + b
						+ "  " + a + " " + b);
			}
		}

		if (c >= a && c > b) {
			if (a >= b) {
				System.out.println("The number in descending order are " + c
						+ "  " + a + " " + b);
			} else {
				System.out.println("The number in descending order are " + c
						+ "  " + b + " " + a);
			}
		}

	}
}
