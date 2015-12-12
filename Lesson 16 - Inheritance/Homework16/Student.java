public class Student extends Person {

	private int score;

	public Student() {

	}

	public Student(String name, int age, boolean isMale, int score) {
		super(name, age, isMale);
		this.score = score;
	}

	void showStudentInfo() {
		showPersonInfo();
		System.out.println("Score is : " + this.score + "\n");
	}
}