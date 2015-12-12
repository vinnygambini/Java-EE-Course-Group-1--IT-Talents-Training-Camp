import java.util.Scanner;


public class Task_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		boolean isPalindrome = true;
		sc.close();
		
		for (int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome){
			System.out.println("The string is isPalindrome");
		}else{
			System.out.println("The string isn't isPalindrome");
		}

	}

}
