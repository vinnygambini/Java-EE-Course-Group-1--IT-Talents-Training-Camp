import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first word");
		String firstString = input.next();

		System.out.println("Enter second word");
		String secondString = input.next();
		input.close();

		System.out.println(firstString.toUpperCase() +" "+firstString.toLowerCase());
		System.out.print(secondString.toUpperCase() +" "+secondString.toLowerCase());
	}

}
