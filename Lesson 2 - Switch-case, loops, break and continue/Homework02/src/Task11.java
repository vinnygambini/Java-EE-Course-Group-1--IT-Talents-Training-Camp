import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			int blank = number - 1;
			int asterix = 1;
			for (int i = 1; i <= number; i++) {
				for (int j = blank; j >= 1; j--) {
					System.out.print(" ");
				}
				blank--;
				for (int k = 1; k <= asterix; k++) {
					System.out.print("*");
				}
				asterix += 2;
				System.out.println();
		}
	}

}
