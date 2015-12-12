import java.util.Scanner;

public class Task12 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a day");
		int day = input.nextInt();

		System.out.println("Enter a month");
		int month = input.nextInt();

		System.out.println("Enter a year");
		int year = input.nextInt();
		
		if (year % 4 == 0 && year % 400 == 0) {
			System.out.println("Year is Leap");

			int newDate = day + 1;
			if (month == 1) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(day + "," + month + "," + year);
				}
			}

			else if (month == 2) {
				if (newDate > 29) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}

			}

			else if (month == 3) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 4) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 5) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 6) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 7) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 8) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 9) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 10) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 11) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 12) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			}

			
			
		} else {
			System.out.println("Year isn't leap");
			int newDate = day + 1;
			if (month == 1) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			}

			else if (month == 2) {
				if (newDate > 28) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}

			}

			else if (month == 3) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 4) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 5) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 6) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 7) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 8) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 9) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 10) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 11) {
				if (newDate > 30) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			} else if (month == 12) {
				if (newDate > 31) {
					newDate = 1;
					month++;
					System.out.println(newDate + "," + month + "," + year);
				} else {
					System.out.println(newDate + "," + month + "," + year);
				}
			}
		}
	}
}
