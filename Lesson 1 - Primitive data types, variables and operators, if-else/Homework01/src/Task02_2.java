import java.util.Scanner;


public class Task02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only int variables
	    
	  	Scanner input = new Scanner(System.in);
		System.out.println("Please,enter two numbers a and b: ");
		System.out.print("a= ");
		int a = input.nextInt();
		System.out.print("b= ");
		int b = input.nextInt();

		int substract = a - b;
		int sum = a + b;
		int divsion = a / b;
		int multiply = a * b;
		int module = a % b;
		
		System.out.println("a - b = "+ substract);
		System.out.println("a + b = "+ sum);
		System.out.println("a / b = "+ divsion);
		System.out.println("a * b = "+ multiply);
		System.out.println("a % b = "+ module);
	
	}

}
