public class Employee extends Person {

	private int daySalary;

	public Employee(String name, int age, boolean isMale, int daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}

	double calculateOvertime(double hours) {
		if (this.getAge() < 18) {
			return 0;
		} else {
			return hours * (1.5 * this.daySalary);
		}
	}

	void showEmployeeInfo() {
		showPersonInfo();
		System.out.print("Day salary: " + this.daySalary + " lv \n");
	}
}
