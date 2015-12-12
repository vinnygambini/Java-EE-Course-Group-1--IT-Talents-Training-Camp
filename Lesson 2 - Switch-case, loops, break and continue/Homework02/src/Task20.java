public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(number + " ");
				number++;
				if (number > 9) {
					number = 0;
				}
			}
			number++;
			if (number > 9) {
				number = 0;
			}
			System.out.println();
		}

	}

}
