import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers n & m (n<m) ");
		System.out.print("Enter first number n= ");
		int n = input.nextInt();
		System.out.print("Enter second number m= ");
		int m = input.nextInt();

		int sum = 0;
		for (int i = n; i < m; i++) {
			
			int newNum = i * i;
			if (i % 3 == 0) {
				System.out.print("Skip " + i + ",");
				continue;
			}
			
			System.out.print(newNum + ",");
			sum =sum + newNum;
			if (sum > 200) {
			break;
			}
			
			
		}
	}
}
