import java.util.Scanner;


public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x for xA coordinate between [1..8] ");
		System.out.println("xA= ");
		byte xA = input.nextByte();
		
		System.out.println("Enter y for yA coordinate between [1..8] ");
		System.out.println("yA= ");
		byte yA = input.nextByte();

		System.out.println("Enter x for xB coordinate between [1..8] ");
		System.out.println("xB= ");
		byte xB = input.nextByte();
		
		System.out.println("Enter y for yB coordinate between [1..8] ");
		System.out.println("yB= ");
		byte yB = input.nextByte();

		boolean aIsBlack;
		boolean bIsBlack;
		
		if(xA % 2 !=0 && yA % 2 !=0){
			aIsBlack = true;
		}else if (xA % 2 ==0 && yA % 2 ==0){
			aIsBlack = true;
		}else{
			aIsBlack = false;
		}
		
		if(xB % 2 !=0 && yB % 2 !=0){
			bIsBlack = true;
		}else if (xB % 2 ==0 && yB % 2 ==0){
			bIsBlack = true;
		}else{
			bIsBlack = false;
		}
		
		if(aIsBlack == bIsBlack){
			System.out.println("Possition are with same color");
		}else{
			System.out.println("Possition are with the different color");
		}
	}	
}