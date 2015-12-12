import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number between  [1..999] a= ");
		int num = input.nextInt();
		while (num < 1 && num > 999) {
			System.out.println("invalid number.Enter again...  a= ");
			num = input.nextInt();
		}

		int count = 1;
		while (true) {
			if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				if (count == 10) {
					System.out.print(count + ":" + num + ", ");
					break;
				} else {
					System.out.print(count + ":" + num + ", ");
				}
				count++;
			}
			num++;
		}

	}

}
