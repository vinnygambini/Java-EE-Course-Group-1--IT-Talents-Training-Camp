import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter a number between  [1..51] n= ");
		int n = input.nextInt();
		while (n < 1 && n > 51) {
			System.out.println("invalid number.Enter again...  n= ");
			n = input.nextInt();

			String card = "";

			int cardValue = (int) Math.ceil(n / 4.0);
			int suit = n % 4;

			for (int i = n; i <= 52; i++) {

				switch (cardValue) {
				case 1:
					card = "2";
					break;
				case 2:
					card = "3";
					break;
				case 3:
					card = "4";
					break;
				case 4:
					card = "5";
					break;
				case 5:
					card = "6";
					break;
				case 6:
					card = "7";
					break;
				case 7:
					card = "8";
					break;
				case 8:
					card = "9";
					break;
				case 9:
					card = "10";
					break;
				case 10:
					card = "Вале";
					break;
				case 11:
					card = "Дама";
					break;
				case 12:
					card = "Поп";
					break;
				case 13:
					card = "Асо";
					break;
				}

				switch (suit) {
				case 1:
					System.out.println(card + "спатия, ");
					i++;
				case 2:
					System.out.println(card + "каро, ");
					i++;
				case 3:
					System.out.println(card +"купа, ");
					i++;
				case 4:
					if (cardValue == 13) {
						System.out.println(card +"пика");
					} else {
						System.out.println("пика, ");
					}
				}

				cardValue++;
				suit = 1;
			}

		}

	}

}
