import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
System.out.println("�������� ����� �����[10..9999]");
		int amoutOfWater = input.nextInt();

		if (amoutOfWater < 10 || amoutOfWater > 9999) {
			System.out.println("��������� ����!�������� ������");
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
			System.out.println((numOfBuckets + 2) + " ���� �� 2 �����" + numOfBuckets + "���� �� 3 �����");
			
			
		}else if(amoutOfWater == 3){
			System.out.println(numOfBuckets + " ���� �� 2 �����" + (numOfBuckets + 1) + "���� �� 3 �����");
		}else if(amoutOfWater == 2){
			System.out.println((numOfBuckets + 1) + " ���� �� 2 �����" + numOfBuckets  + "���� �� 3 �����");
		}else if(amoutOfWater == 1){
			System.out.println((numOfBuckets + 2) + " ���� �� 2 �����" + (numOfBuckets - 1) + "���� �� 3 �����");
		}else {
			System.out.println(numOfBuckets + " ���� �� 2 �����" + numOfBuckets  + "���� �� 3 �����");
		}
		
	}

}
