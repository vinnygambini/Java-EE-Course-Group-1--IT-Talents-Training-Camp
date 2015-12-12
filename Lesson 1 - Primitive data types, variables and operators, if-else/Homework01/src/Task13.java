import java.util.Scanner;


public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius between [-100..100]. ");
	
		int temperature = input.nextInt();
		if(temperature <-100 || temperature > 100){
			System.out.println("Invalid temerature.Enter it again");
			temperature = input.nextInt();
		}
		
		if (temperature <-20) {
			System.out.println("Freezing Cold!!!");
		}
		else if(temperature >= -20 && temperature <= 0){
			System.out.println("It's Cold!!!");
		}
		else if(temperature > 0 && temperature <= 15){
			System.out.println("It's cool");
		}
		else if(temperature > 15 && temperature <=25){
			System.out.println("It's warm!");
		}else {
			System.out.println("It's hot outside");
		}
		
	}

}
