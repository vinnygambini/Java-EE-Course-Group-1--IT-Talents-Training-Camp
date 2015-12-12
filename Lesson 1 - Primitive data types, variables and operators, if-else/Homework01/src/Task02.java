import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//only double variables
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please,enter two floating point numbers a and b: ");
		System.out.print("a= ");
		double a = input.nextDouble();
		System.out.print("b= ");
		double b = input.nextDouble();
		
		
		double substract = a - b;
		double sum = a + b;
		double divsion = a / b;
		double multiply = a * b;
		double reminder = a % b;
		
		System.out.println("a - b = "+ substract);
		System.out.println("a + b = "+ sum);
		System.out.println("a / b = "+ divsion);
		System.out.println("a * b = "+ multiply);
		System.out.println("a % b = "+ reminder);
	}

}
