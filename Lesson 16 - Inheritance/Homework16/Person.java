public class Person {
	private String name;
	private int age;
	boolean isMale;

	public Person() {

	}

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	void showPersonInfo() {
		System.out.println("Name: " + this.name + "\n" + " Age: " + this.age
				+ "\n" + " Sex: " + isMale + "\n"
						+ "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

}
