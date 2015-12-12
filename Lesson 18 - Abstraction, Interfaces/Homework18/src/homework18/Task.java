package homework18;

public class Task {
	
	private String name;
	private int workingHours;
	
	public Task(String name, int workingH){
		
		this.name = name;
		this.workingHours = workingH;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	

}
