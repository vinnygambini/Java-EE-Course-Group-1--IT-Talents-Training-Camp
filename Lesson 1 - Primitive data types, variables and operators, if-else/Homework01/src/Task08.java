import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between [1000.. 9999]");
		short number = input.nextShort();
		if (number < 1000 || number > 9999) {
			System.out.println("Wrong number.Try again");
			number = input.nextShort();
		}
			int firstAndForthDigit = ((number/1000)%10)*10 + number%10; 
			int secondAndThirdDigit = ((number/100)%10)*10 + (number/10)%10;
			
		if(firstAndForthDigit > secondAndThirdDigit){
			System.out.println("The first number is bigger than the second ("+firstAndForthDigit+" > "+secondAndThirdDigit+")");
		} else if (firstAndForthDigit < secondAndThirdDigit){
			System.out.println("The first number is smaller than the second("+firstAndForthDigit+" < "+secondAndThirdDigit+")");
		}else {
			System.out.println("The first and second numbers are equal ("+firstAndForthDigit+" = "+secondAndThirdDigit+")");
		}

	}

}
