import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете час/цяло число/");
		int hour = input.nextInt();
		System.out.println("Въведете сума пари/число с плаваща запетая/");
		double amountOfMoney = input.nextDouble();
		boolean healthy = true;

		if (healthy = false) {
			System.out.println("ако съм болен няма да излизам");
		}
			if(amountOfMoney >0){
				System.out.println(" ако имам пари ще си купя лекарства");
			}
			 else {
			System.out.println("ако нямам – ще стоя вкъщи и ще пия чай");
		} 
		if(healthy = true){
			if(amountOfMoney > 10){
			System.out.println("ако съм здрав ще отида на кино с приятели");
			}
		}
		else {
				System.out.println("ако имам по-малко от 10 лв ще отида на кафе");
			}
	}
}
