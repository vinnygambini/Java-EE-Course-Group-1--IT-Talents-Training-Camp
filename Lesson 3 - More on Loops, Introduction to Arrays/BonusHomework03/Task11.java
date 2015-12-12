import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 7 whole numbers... = ");

		int[] Array = new int[7];
		for (int i = 0; i < Array.length; i++) {
			System.out.print("Enter index " + (i + 1) + " =");
			Array[i] = input.nextInt();
		}
		input.close();
		int counter = 0;

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] > 5 && Array[i] % 5 == 0) {
				if (counter == 0) {
					System.out.print(Array[i]);
					counter++;
				}else{
					System.out.print(", " + Array[i]);
					counter++;
				}
			}

		}
		if (counter == 0) { 
			System.out.println("None of the entered numbers is bigger than 5 and it's not devidable by 5");
		} else if (counter == 1) {
			System.out.println(counter + " number");
		} else {
			System.out.println(counter+ " numbers" );
		}

	}

}
