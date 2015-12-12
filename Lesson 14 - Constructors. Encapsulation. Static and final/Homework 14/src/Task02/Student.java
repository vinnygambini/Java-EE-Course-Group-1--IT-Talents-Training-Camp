package Task02;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private byte yearInCollege;
	private byte age;
	private boolean isDegree;
	private double money;

	// default constructor
	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	// second constructor

	public Student(String name, String subject, byte age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	public void upYear() {

		if (!isDegree) {
			yearInCollege++;
			checkYearInCollege();

		} else {
			System.out.println("Student is graduated!");
		}
	}

	public void checkYearInCollege() {
		if (yearInCollege >= 4) {
			isDegree = true;
		}
	}

	public double receiveScholarship(double min, double amount) {

		if (grade >= min && age < 30) {
			this.money = this.money + amount;
			return money;
		}

		return money;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Joro", "Telefonist", (byte) 25);

		s1.receiveScholarship(3, 250);
		s1.upYear();
		s1.upYear();
		s1.upYear();
		s1.upYear();
		s1.upYear();

		System.out.println(s1.yearInCollege);
		System.out.println(s1.money);

	}
}
