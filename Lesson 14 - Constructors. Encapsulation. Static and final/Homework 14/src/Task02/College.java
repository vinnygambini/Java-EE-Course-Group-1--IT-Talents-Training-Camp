package Task02;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Joro", "KST", (byte)25);
		Student s2 = new Student("Pesho", "KST", (byte)25);
		Student s3 = new Student("Gesho", "KST", (byte)25);
		Student s4 = new Student("Misho", "KST", (byte)25);
		Student s5 = new Student("Tisho", "KST", (byte)25);
		Student s6 = new Student("Ivo", "KST", (byte)25);
		
		s3.setGrade(5);
		s5.setGrade(5.5);
		s2.setGrade(6);
		
		s1.receiveScholarship(4, 500);
		s2.receiveScholarship(5, 250.00);
		
		
		s2.upYear();
		s5.upYear();
		s6.upYear();
		
		StudentGroup sg1 = new StudentGroup("KST") ;
		
		sg1.addStudent(s1);
		sg1.addStudent(s2);
		sg1.addStudent(s3);
		sg1.addStudent(s4);
		sg1.addStudent(s5);
		sg1.addStudent(s6);

	
		System.out.println(sg1.printStudentsInGroup());
		
		
		System.out.println("The best student in group is "+ sg1.theBestStudent());

	}

}

