import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number between [1..9] a =  ");
			a = input.nextInt();
			System.out.print("Enter b number between [1..9] b =  ");
			b = input.nextInt();
		} while ((a < 1 && a > 9 && a > b) && (b < 1 && b > 9) && b < a
				&& a == b);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.println(i + " * " + j + " = " + (i * j)+ ";");
			}
		}
	}
}