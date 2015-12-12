import java.util.Arrays;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int[] Array = new int[10];
		for (int i = 0; i < Array.length; i++) {
			System.out.print("Enter index " + (i + 1)+" =");
			Array[i] = input.nextInt();
		}
		input.close();
		
		for (int i = 0; i < Array.length; i++) {
			Array[i] = i * 3;
		}
		System.out.println(Arrays.toString(Array));
	}

}
