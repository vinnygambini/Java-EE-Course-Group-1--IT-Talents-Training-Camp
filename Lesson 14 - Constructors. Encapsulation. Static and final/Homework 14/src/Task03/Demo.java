package Task03;

public class Demo {

	public static void main(String[] args) {
		
			Task  cleaning = new Task("Cleaning", 17);
			
			Employee ivan = new Employee("Ivan");
			Employee asen = new Employee("Asen");
			
			asen.setHoursLeft(8);
			asen.setCurrentTask(cleaning);;
			asen.work();
			asen.showReport();
			
			ivan.setHoursLeft(8);
			ivan.setCurrentTask(cleaning);
			ivan.work();
			ivan.showReport();
	}

}
