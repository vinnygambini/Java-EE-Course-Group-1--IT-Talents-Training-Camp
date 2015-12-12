import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number between [10..99] a =  ");
			a = input.nextInt();

		} while ((a < 10) && (a > 99));

		while (a > 1) {
			if (a % 2 == 0) {
				a = a / 2;
				System.out.print(a);
			} else {
				a = a * 3 + 1;
				System.out.print(a + " ");
			}

		}
	}

}
