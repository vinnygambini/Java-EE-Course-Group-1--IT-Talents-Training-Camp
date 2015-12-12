import java.util.Scanner;

public class Task24 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number between [10 .. 30000] a= ");
		int a = input.nextInt();
		while (a < 10 && a > 30000) {
			System.out.println("invalid number.Enter again...  a= ");
			a = input.nextInt();
		}

		
		int n = a; // used at last time check
		int reverse = 0;
		int remainder;
		
		while (a > 0) {
			remainder = a % 10;
			reverse = reverse * 10 + remainder;
			a = a / 10;
		}
		if (reverse == n)
			System.out.println(n + " is a Palindrome Number");
		else
			System.out.println(n + " is not a Palindrome Number");
	}

}
