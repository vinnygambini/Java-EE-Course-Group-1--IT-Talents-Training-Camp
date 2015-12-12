import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter two numbers a and b between [10..99] ");
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();

		if (a < 10 || b > 99) {
			System.out.println("Invalid numbers.Enter new numbers...");
			a = input.nextInt();
			b = input.nextInt();
		}

		// check if the number is even
		int multiply = a * b;
		if ((multiply % 2 == 0)) {
			System.out.println(multiply + ", " + multiply % 10 + " Even");
		} else {
			System.out.println(multiply + ", " + multiply % 10 + " Odd");
		}

	}

}
