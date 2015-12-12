
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1,4,6,3},
				{5,9,7,2},
				{4,8,1,9},
				{2,3,4,5}
	};
	
	for (int i = 0; i < matrix.length; i++) {
		System.out.print(matrix[i][i]+" ");
		}
	
	System.out.println();
	
	for (int i = 0; i < matrix.length; i++) {
		System.out.print(matrix[i][Math.abs(i-matrix.length+1)]+" ");
	}
	}

}
