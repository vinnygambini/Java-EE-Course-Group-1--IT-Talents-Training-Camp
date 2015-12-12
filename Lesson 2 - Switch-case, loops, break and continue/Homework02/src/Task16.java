import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number between [10..5555] a < b a =  ");
			a = input.nextInt();
			System.out.print("Enter b number between [10..5555] b > a b =  ");
			b = input.nextInt();
		} while ((a < 10 && a > 5555 && a > b) && (b < 10 && b > 5555) && b < a
				&& a == b);

		for (int i = b; i >= a; i--) {
			
			if (i % 50 == 0) {
				System.out.println(i);
			}

		}
	}
}