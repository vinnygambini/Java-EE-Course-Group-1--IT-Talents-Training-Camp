import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter two real numbers a and b: ");
		System.out.print("a= ");
		double a = input.nextDouble();
		System.out.print("b= ");
		double b = input.nextDouble();
		String ab = "ssa";

		if (a > b) {
			System.out.println("The number in ascending order are " + a + " & "
					+ b);
		} else if (b < a) {
			System.out.println("The number in ascending order are " + b + " & "
					+ a);
		} else {
			System.out.println("The numbers are equal");
		}

	}

}
