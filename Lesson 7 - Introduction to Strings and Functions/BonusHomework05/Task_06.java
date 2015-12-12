import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter some words, separated by space: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder(sentence.length());
		sc.close();
		for (int i = 0; i < words.length; i++) {
			if (i > 0){
				result.append(" ");
			}
			for (int j = 0; j < words[i].length(); j++) {
				if(j==0){
					result.append(Character.toUpperCase(words[i].charAt(j)));
				}else{
					result.append(Character.toLowerCase(words[i].charAt(j)));
				}
			}
		}
		System.out.println(result);
	}
}
