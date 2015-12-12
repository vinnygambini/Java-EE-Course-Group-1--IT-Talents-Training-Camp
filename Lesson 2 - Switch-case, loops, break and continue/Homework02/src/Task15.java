import java.util.Scanner;


public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		int number = input.nextInt();
		int sum = 0;
		int i =1;
		do {
			sum +=i;
			i++;
			
		} while (i<=number);
		System.out.println(sum);
	}

}
