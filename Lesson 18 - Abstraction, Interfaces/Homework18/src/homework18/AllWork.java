package homework18;

public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnsignedTask = 0;
	
	public AllWork(){
		
			this.freePlacesForTasks = 10;
			tasks = new Task[10];
		
	}
	
	public void addTask(Task task){
		
		if (freePlacesForTasks > 0){
		
			tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks--;
			
		}else{
			System.out.println("No sapce for tasks!");
		}
		
	
		
	}
	
	public Task getNextTask(){
		
		if (currentUnsignedTask < tasks.length) {
			currentUnsignedTask++;
			return tasks[currentUnsignedTask - 1];
		} else {
			return null;
		}
	}
	
	public boolean isAllWorkDone(){
		
		boolean isItDone = true;
		
		for(Task task: tasks){
			if(task.getWorkingHours() != 0){
				isItDone = false;
			}
		}
		
		if(isItDone){
			
			System.out.println("All tasks are done!");
			
		}else{
			System.out.println("Tasks needs to be done!");
		}return isItDone;
		
	}
	
	public Task[] getTasks() {
		return tasks;
	}
	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}
	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}
	public void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}
	public int getCurrentUnsignedTask() {
		return currentUnsignedTask;
	}
	public void setCurrentUnsignedTask(int currentUnsignedTask) {
		this.currentUnsignedTask = currentUnsignedTask;
	}

}
