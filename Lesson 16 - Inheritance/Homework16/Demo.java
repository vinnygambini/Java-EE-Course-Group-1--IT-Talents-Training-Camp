public class Demo {

	public static void main(String[] args) {

		//Отговор на въпорса...
		//При наследяване конструкторите на наследника извикват коснтруктирите на супер класа и при създаване
		//на дефолтен конструктор в суб класа,трябва или в супер класа да имаме дефоутен конструкор,или да извикаме 
		//коснтрукор от супер класа,на който да му му подадем параметри.
		
		Person[] people = new Person[10];
		people[0] = new Person("Asen", 20, true);
		people[1] = new Person("Ivan", 25, true);
		people[2] = new Student("Ani", 19, false ,6);
		people[3] = new Student("Milena", 18, false, 4);
		people[4] = new Employee("Todor", 30, true, 132);
		people[5] = new Employee("Georgi", 35, true, 150);

		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Student) {
				((Student) people[i]).showStudentInfo();
				System.out.println();
			} else if (people[i] instanceof Employee) {
				((Employee) people[i]).showEmployeeInfo();
				System.out.println();
			} else if (people[i] instanceof Person) {
				people[i].showPersonInfo();
				System.out.println();
			} else
				continue;
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				System.out.print("The employee " + people[i].getName()
						+ " will receive "
						+ ((Employee) people[i]).calculateOvertime(2)
						+ " leva for working overtime.\n");

			}
		}

	}
}
