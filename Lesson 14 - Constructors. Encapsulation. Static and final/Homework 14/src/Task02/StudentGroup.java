package Task02;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {

		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
		
	}
	
	public void addStudent(Student s){
	
		if(s.getSubject().equals(groupSubject) && this.freePlaces > 0){
		
			this.students[5 - this.freePlaces] = s;
			this.freePlaces--;
		}
		
	}

	public void emptyGroup() {
		
		this.students = null;
		this.students =  new Student [5];
		this.freePlaces = 5;

	}

	public String theBestStudent() {
		
		double bestGrade = 0;
		String studentBestGrade = "";
		for(int i =0; i < this.students.length; i++){
			if(students[i].getGrade() > bestGrade){
				bestGrade = students[i].getGrade();
				studentBestGrade = students[i].getName();
			}
		}
		
		return studentBestGrade;

	}

	public String printStudentsInGroup() {
		
		
		String studentsList = "";
		for(int i = 0; i < this.students.length; i++){
			
			studentsList = studentsList 
			+ this.students[i].getName().toString() +  " " 
			+ this.students[i].getSubject().toString() + " "
			+ this.students[i].getGrade() +  "! \n";			
			
		}
		
		return studentsList;

	}
	
}
