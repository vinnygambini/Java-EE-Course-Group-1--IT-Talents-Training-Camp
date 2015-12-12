import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number n = ");
		int n = input.nextInt();
		
		int counter =0;
		
		for (int i = 3; i < 100; i+=3) {
			counter++;
			if(counter == n){
			System.out.print(i +",");
			break;
		}
		System.out.print(i +",");
		}
		
	}

}
