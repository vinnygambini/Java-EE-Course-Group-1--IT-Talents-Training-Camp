package homework18;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	public Employee(String name) {

		this.name = name;

	}

	public static AllWork getAllWork() {
		return allWork;
	}

	public static void setAllWork(AllWork allWork) {
		Employee.allWork = allWork;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals("")) {
			this.name = name;
		} else {
			System.out.println("Name can not be empty!");
		}

	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (!currentTask.equals("")) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Task can not be empty!");
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 1) {
			this.hoursLeft = hoursLeft;

		} else {
			System.out.println("Working hours can't be less than 1!");
		}
	}

	public void work() {

		for (Task task : allWork.getTasks()) {

			if (task.getWorkingHours() != 0) {

				int hoursLeftForToday = getHoursLeft();
				int hoursForCurrentTask = task.getWorkingHours();
				
				if (hoursLeftForToday > hoursForCurrentTask) {

					setHoursLeft(hoursLeftForToday - hoursForCurrentTask);
					System.out.println("Worker " +getName() +" needs to work " + getHoursLeft()
							+ " more hours!");
					task.setWorkingHours(0);
					System.out.println("Worker " +  getName() +  " finish the task " + task.getName());

				} else if (hoursForCurrentTask > hoursLeftForToday) {

					task.setWorkingHours(hoursForCurrentTask
							- hoursLeftForToday);
					System.out.println("Worker " + getName() + " doe's not finish task " + task.getName() + " and he will work "
							+ task.getWorkingHours() + " hours for next day to do the job!");

					setHoursLeft(0);
					System.out.println("Worker " + getName()
							+ " is done his job for today!");

				} else {

					setHoursLeft(0);
					System.out.println("Worker " + getName()
							+ " is done his job for today!");
					task.setWorkingHours(0);
					System.out.println("Worker " +  getName() +  " finish the task " + task.getName());
				}

			}

		}

	}

	public void startWorkingDay() {

		setHoursLeft(8);

	}

}
