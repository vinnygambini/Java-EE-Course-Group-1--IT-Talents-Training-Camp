import java.util.Scanner;

public class Task11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number a=  ");
		int a = input.nextInt();

		int blank = a - 1;
		int asterix = 1;
		int bottom = 1;
		
		for (int i = 1; i <= a - 1; i++) {
			bottom += 2;
		}
		for (int i = 1; i < a; i++) {
			for (int j = blank; j >= 1; j--) {
				System.out.print(" ");
			}
			blank--;
			for (int k = 1; k <= asterix; k++) {
				if (k > 1 && k < asterix) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			asterix += 2;
			System.out.println();
		}
		for (int j = 1; j <= bottom; j++) {
			System.out.print("*");
		}
	}

}
