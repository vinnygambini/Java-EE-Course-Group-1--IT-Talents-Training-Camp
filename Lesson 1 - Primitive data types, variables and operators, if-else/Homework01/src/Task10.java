import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
System.out.println("Въведете число между[10..9999]");
		int amoutOfWater = input.nextInt();

		if (amoutOfWater < 10 || amoutOfWater > 9999) {
			System.out.println("Невалидно чило!Въведете отново");
			amoutOfWater = input.nextInt();
		}

		int volumeOfBuckets = 5;
		int numOfBuckets = 0;

		boolean b = true;
		
		while(b)
		{
			amoutOfWater = amoutOfWater - volumeOfBuckets;
			numOfBuckets++;
			
			if(amoutOfWater == 0 || amoutOfWater < volumeOfBuckets)
				b = false;
		}
		
		if(amoutOfWater == 4){
			System.out.println((numOfBuckets + 2) + " пъти по 2 литра" + numOfBuckets + "пъти по 3 литра");
			
			
		}else if(amoutOfWater == 3){
			System.out.println(numOfBuckets + " пъти по 2 литра" + (numOfBuckets + 1) + "пъти по 3 литра");
		}else if(amoutOfWater == 2){
			System.out.println((numOfBuckets + 1) + " пъти по 2 литра" + numOfBuckets  + "пъти по 3 литра");
		}else if(amoutOfWater == 1){
			System.out.println((numOfBuckets + 2) + " пъти по 2 литра" + (numOfBuckets - 1) + "пъти по 3 литра");
		}else {
			System.out.println(numOfBuckets + " пъти по 2 литра" + numOfBuckets  + "пъти по 3 литра");
		}
		
	}

}
