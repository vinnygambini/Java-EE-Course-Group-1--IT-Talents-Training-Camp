import java.util.Scanner;


public class врsъ08 {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner (System.in);
        int x=0, y=0;
        System.out.print("Enter rows ");
        x = keyboard.nextInt();
        System.out.print("Enter columns ");
        y = keyboard.nextInt();

        for (int i=1; i<=x; i++) 
        {
            for (int j=1; j<=y; j++)
            {
                System.out.print(" "+i+j);
            }
            System.out.println(); 
        }
	}
}
