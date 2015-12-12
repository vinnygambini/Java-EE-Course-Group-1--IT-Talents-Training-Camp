import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int ArrayLenght = number;
		input.close();

		int counter = 0;

		while (ArrayLenght > 0) {
			ArrayLenght /= 2;
			counter++;
		}
		int[] toBinary = new int[counter];
		int binary = 0;

		while (number > 0) {
			binary = number % 2;
			toBinary[counter - 1] = binary;
			counter--;
			number /= 2;
		}
		for (int i = 0; i < toBinary.length; i++) {
			System.out.print(toBinary[i]);
		}
	}

}