import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		int number = input.nextInt();

		for (int i = 200; i > 10; i--) {
			//System.out.println(i);
			if (i % 7 == 0 && i < number) {
				System.out.println(i);	
			}
		}
	}

}
