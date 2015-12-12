public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rez = "";
		int i = 0;
		while (i < 10) {
			i++;
			int j = i;

			while (j < 10) {
				rez += i+"*"+j+";";
				j++;
			}
			System.out.println(rez);
			rez = "";
		}
	}
}
