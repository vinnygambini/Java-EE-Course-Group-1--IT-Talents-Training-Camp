package homework18;

public class Work {

	public static void main(String[] args) {
		
		
		AllWork allWork = new AllWork();
		
		allWork.addTask(new Task("������", 12));
		allWork.addTask(new Task("�������", 6));
		allWork.addTask(new Task("�������", 3));
		allWork.addTask(new Task("������", 12));
		allWork.addTask(new Task("�����", 14));
		allWork.addTask(new Task("������", 3));
		allWork.addTask(new Task("�������", 22));
		allWork.addTask(new Task("���������", 17));
		allWork.addTask(new Task("���������", 4));
		allWork.addTask(new Task("������", 22));
		allWork.addTask(new Task("�������", 4));
		allWork.addTask(new Task("���������", 6));

		
		Employee e1 = new Employee("Ivan");
		Employee e2 = new Employee("Valio");
		Employee e3 = new Employee("Pesho");
		Employee e4 = new Employee("Gosho");
		
		Employee.setAllWork(allWork);
		
		System.out.println("Is work done " + allWork.isAllWorkDone());
		
		int workingDay = 1;
		
		do{
			
			
			System.out.println("Start of workind day :" + workingDay);
			
			e1.startWorkingDay();
			e2.startWorkingDay();
			e3.startWorkingDay();
			e4.startWorkingDay();

			
			e1.work();
			e2.work();
			e3.work();
			e4.work();
			
			System.out.println("End of workind day :" + workingDay+"\n");
			workingDay++;
			   
			
			
			
		}while(!allWork.isAllWorkDone());
		
		

	}
	
	

}