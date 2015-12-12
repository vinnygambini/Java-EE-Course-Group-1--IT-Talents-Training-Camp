import java.util.Scanner;

public abstract class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an hour between 0 and 24 ");
		byte hour = input.nextByte();

		if (hour < 0 || hour > 24) {
			System.out.println("Invalid hour,ener it again ");
			hour = input.nextByte();
		}

		if (hour < 4 || hour > 18) {
			System.out.println("Good evening");
		} else if (hour > 4 && hour < 9) {
			System.out.println("Good morning");
		} else if (hour > 9 && hour<18) {
			System.out.println("Good afternoon");
		}
	}
}
