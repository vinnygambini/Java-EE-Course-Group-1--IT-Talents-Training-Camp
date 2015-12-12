import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit number...");
		short number = input.nextShort();

		int firstDigit = (number / 100) % 10;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;

		if (firstDigit == 0 && secondDigit == 0 && thirdDigit == 0) {
			System.out.println("Wrong number.Can not divide by 0.Enter another one");
			number = input.nextShort();
		}
		if (number%(number%10)==0 && number%((number/10)%10)==0 && number%((number/10)%10)==0){
			System.out.println("Number is dividable by all its numbers.");
		}else{
			System.out.println("Number isn't dividable by all its numbers..");
	}

}
}