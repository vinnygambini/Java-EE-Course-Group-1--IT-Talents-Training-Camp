import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("�������� ���/���� �����/");
		int hour = input.nextInt();
		System.out.println("�������� ���� ����/����� � ������� �������/");
		double amountOfMoney = input.nextDouble();
		boolean healthy = true;

		if (healthy = false) {
			System.out.println("��� ��� ����� ���� �� �������");
		}
			if(amountOfMoney >0){
				System.out.println(" ��� ���� ���� �� �� ���� ���������");
			}
			 else {
			System.out.println("��� ����� � �� ���� ����� � �� ��� ���");
		} 
		if(healthy = true){
			if(amountOfMoney > 10){
			System.out.println("��� ��� ����� �� ����� �� ���� � ��������");
			}
		}
		else {
				System.out.println("��� ���� ��-����� �� 10 �� �� ����� �� ����");
			}
	}
}
