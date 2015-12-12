import java.util.Arrays;
import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int[] array = new int [10];
		array[0]=number;
		array[1]=number;
		int element1 = number;
		int element2 = number;
		for (int i = 2; i < array.length; i++) {
			array[i] = element1 + element2;
			element2 = element1;
			element2 = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ ",");	
		}
		
	}
	}


