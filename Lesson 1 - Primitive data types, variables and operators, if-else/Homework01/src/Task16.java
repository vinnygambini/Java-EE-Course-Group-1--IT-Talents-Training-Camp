import java.util.Scanner;


public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit number. ");
		short number = input.nextShort();
		
		int firstDigit = number % 10;
		int secondDigit = (number/10)%10;
		int thirdDigit = (number/100)%10;
		
		if( (firstDigit == secondDigit) && (firstDigit == thirdDigit) && (secondDigit == thirdDigit)){
			System.out.println("The digits are equal");
		} 
		else if ((firstDigit > secondDigit) && (secondDigit > thirdDigit)){
			System.out.println("The digits are in ascending order");
		}
		else if((firstDigit < secondDigit) && (secondDigit < thirdDigit)){
			System.out.println("The digits are in descending order");
		}
	}

}
