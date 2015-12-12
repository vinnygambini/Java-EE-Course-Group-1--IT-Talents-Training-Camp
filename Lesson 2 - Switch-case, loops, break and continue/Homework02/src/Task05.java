import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;


public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number a= ");
		int a = input.nextInt();
		System.out.println("Enter second number b=");
		int b = input.nextInt();
		
		for(int i = a; i <=b; i++){
		System.out.print(i + ",");
		}
	}

}
