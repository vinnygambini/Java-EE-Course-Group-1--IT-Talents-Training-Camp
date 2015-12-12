package homework18;

public class Work {

	public static void main(String[] args) {
		
		
		AllWork allWork = new AllWork();
		
		allWork.addTask(new Task("Копане", 12));
		allWork.addTask(new Task("Гребане", 6));
		allWork.addTask(new Task("Чистене", 3));
		allWork.addTask(new Task("Цапане", 12));
		allWork.addTask(new Task("Ядене", 14));
		allWork.addTask(new Task("Тичане", 3));
		allWork.addTask(new Task("Гледане", 22));
		allWork.addTask(new Task("Подпиране", 17));
		allWork.addTask(new Task("Съветване", 4));
		allWork.addTask(new Task("Седене", 22));
		allWork.addTask(new Task("Мъмрене", 4));
		allWork.addTask(new Task("Майтапене", 6));

		
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