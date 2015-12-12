import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter tree numbers a1,a2 and a3 ");
		System.out.print("a1= ");
		double a1 = input.nextDouble();
		System.out.print("a2= ");
		double a2 = input.nextDouble();
		System.out.print("a3= ");
		double a3 = input.nextDouble();

		System.out.println("Before swapping the numbers are " + a1 + " and "
				+ a2 + " and " + a3);

		double temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println("After swapping the numbers are " + a1 + " and "
				+ a2 + " and " + a3);
	}

}
