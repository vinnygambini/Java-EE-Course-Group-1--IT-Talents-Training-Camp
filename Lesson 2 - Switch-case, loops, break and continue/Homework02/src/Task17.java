import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter a number between [3 .. 20] a= ");
		int a = input.nextInt();
		while (a < 3 && a > 20) {
			System.out.println("invalid number.Enter again...  a= ");
			a = input.nextInt();
		}

		System.out.println("Enter a symbol: ");
		char ch = input.next().charAt(0);

		for (int i = 1; i <= a; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= a - 2; i++) {
			System.out.print("*");
			for (int j = 1; j <= a - 2; j++) {
				System.out.print(ch);
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= a; i++) {
			System.out.print("*");
		}

	}
}
