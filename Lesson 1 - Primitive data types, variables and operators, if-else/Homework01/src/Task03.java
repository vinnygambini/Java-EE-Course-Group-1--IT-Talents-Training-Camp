import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter two numbers a and b: ");
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();

		System.out.println("Before swapping the numbers are " + a + " and " + b);

		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping the numbers are " + a + " and " + b);
	}

}
