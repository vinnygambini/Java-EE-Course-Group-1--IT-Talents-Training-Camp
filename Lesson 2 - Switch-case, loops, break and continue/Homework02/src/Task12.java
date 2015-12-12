import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		int number = input.nextInt();

		for(int i=100; i <1000; i++){
			int firstNumber = i%10;
			int secondNumber= (i/10)%10;
			int thirdNumber = (i/100)%10;
			if((firstNumber != secondNumber) && (firstNumber !=thirdNumber) && (secondNumber!= thirdNumber)){
				System.out.println(i +",");
				
			}
		}
	}
}
