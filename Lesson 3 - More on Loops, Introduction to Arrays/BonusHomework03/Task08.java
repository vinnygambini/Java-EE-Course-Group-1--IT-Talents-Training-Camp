import java.util.Arrays;


public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
		
        int maxCount = 0;
        int value = 0;
        for (int count = 0; count < array.length; count++)
        {
            int currentCount = 0;
            for (int minCount = count; minCount < array.length; minCount++)
            {
                if (array[count] == array[minCount])
                {
                    currentCount++;
                    if (maxCount < currentCount)
                    {
                        maxCount = currentCount;
                        value = array[count];
                    }
                }
                else
                {
                    break;
                }
            }
        }            
        System.out.printf("Array:"+Arrays.toString(array));
        System.out.print("The longest sequence of identical elements is: ");
        for (int i = 0; i < maxCount; i++) {
        	if(i==maxCount-1){
        		System.out.print(value);
        	}else{
        		System.out.print(value+", ");
        	}
		}                 
	}

}
