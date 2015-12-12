import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first word : ");
		String firstWord = input.nextLine();
		
		System.out.print("Enter second word : ");
		String secondWord = input.nextLine();
		input.close();
		
		if(firstWord.length()>secondWord.length()){
			if(firstWord.length()-secondWord.length()==1){
			System.out.print("First word is longer than second.Additional symbol is: ");
			findAdditionalSymbols(firstWord, secondWord);
			}
			else{
				System.out.println("First word is "+(firstWord.length()-secondWord.length())+" symbols longer than the second.Additional symbols are: ");
				findAdditionalSymbols(firstWord, secondWord);
			compareWords(firstWord,secondWord);
			}

		}else if(firstWord.length()<secondWord.length()){
			if(secondWord.length()-firstWord.length()==1){
				System.out.print("Second word is longer than the first.Additional symbol is: ");
				findAdditionalSymbols(firstWord, secondWord);
		}
				else{
					System.out.println("First word is  "+ (firstWord.length()-secondWord.length())+ " symbols longer than second.Additional symbols are: ");
				findAdditionalSymbols(firstWord, secondWord);
				}
			compareWords(firstWord,secondWord);
			
		}else{
			boolean isEqual = true;
			for (int i = 0; i < secondWord.length(); i++) {
				if(firstWord.charAt(i)!=secondWord.charAt(i)){
					isEqual=false;
				}
			}
			if(isEqual){
				System.out.println("Both words are equal.");
			}else{
				System.out.println("Both words are different.");
				compareWords(firstWord,secondWord);
			}
		}
	}
// Ñompare possitions
	
	static void compareWords(String firstWord, String secondWord){
		 boolean isEqual=true;
		 int length = 0;
		 
		 if(firstWord.length()>secondWord.length()){
			 length = secondWord.length();
		 }else{
			 length = firstWord.length();
		 }
		 for (int i = 0; i < length; i++) {
				if(firstWord.charAt(i)!=secondWord.charAt(i)){
					isEqual = false;
					break;
				}
		 }
		 if(isEqual){
			 System.out.println("Both words have no difference in character possitions");
		 }else{
			 System.out.println("Difference in possitions:");
		 for (int i = 0; i < length; i++) {
			if(firstWord.charAt(i)!=secondWord.charAt(i)){
				System.out.println(i+1+" "+ firstWord.charAt(i)+" - "+secondWord.charAt(i));
				}
			}
		}
	 }
	
	//Finding additional possitions in longer sequence
	static void findAdditionalSymbols(String firstWord, String secondWord){
		int length = 0;
		String difference = "";
		 if(firstWord.length()>secondWord.length()){
			 length = firstWord.length()-secondWord.length();
			 difference = firstWord.substring(firstWord.length()-length,firstWord.length());
		 }else{
			 length = secondWord.length()-firstWord.length();
			 difference = secondWord.substring(secondWord.length()-length,secondWord.length());
		 }
		 System.out.println(difference);
	}

}
