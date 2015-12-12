import java.util.Scanner;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator.Fitness;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first word");
		String firstString = input.next();

		System.out.println("Enter second word");
		String secondString = input.next();
		input.close();

		StringBuilder firstStringMod = new StringBuilder();
		StringBuilder secondStringMod = new StringBuilder();

		for (int i = 0; i < firstString.length(); i++) {
			if (i < 5) {
				firstStringMod.append(secondString.charAt(i));
			} else {
				firstStringMod.append(firstString.charAt(i));
			}
		}
		for (int i = 0; i < secondString.length(); i++) {
			if (i < 5) {
				secondStringMod.append(firstString.charAt(i));
			} else {
				secondStringMod.append(secondString.charAt(i));
			}
		}
		if(firstStringMod.length()>secondStringMod.length()){
			System.out.println(firstStringMod.length() + " " + firstStringMod);
		}else{
			System.out.println(secondStringMod.length() + " " + secondStringMod);
		}
	}
}