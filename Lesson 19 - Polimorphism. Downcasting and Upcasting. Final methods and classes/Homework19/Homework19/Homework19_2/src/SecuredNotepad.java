

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad  {
	String password;

	
	public SecuredNotepad(int numberOfpages, String password) {
		super(numberOfpages);
		this.password = password;
	}
	
	@Override
	public void addHeading(int pageNumber, String heading) {
		System.out.println("You are not authorized to perform this operation1");
	}
	@Override
	public void addText(String text, int pageNumber) {
		System.out.println("You are not authorized to perform this operation2");
	}
	@Override
	public void replaceText(String text, int pageNumber) {
		System.out.println("You are not authorized to perform this operation3");
	}
	@Override
	public void deleteText(int pageNumber) {
		System.out.println("You are not authorized to perform this operation4");
	}
	@Override
	public void printNote(int pageNumber) {
		System.out.println("You are not authorized to perform this operation5");
	}
	@Override
	public void printNotes() {
		System.out.println("You are not authorized to perform this operation6");
	}
	
	public void addPageHeading(String password, int pageNumber, String heading) {
		if (this.password.equals(password)) {
			super.addHeading(pageNumber, heading);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}
	}

	public void addText(String password, int pageNumber, String text) {
		if (this.password.equals(password)) {
			super.addText(text, pageNumber);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}
	}

	public void replaceText(String password, int pageNumber, String text) {
		if (this.password.equals(password)) {
			super.deleteText(pageNumber);
			super.addText(text, pageNumber);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}
	}

	public void deletePageText(String password, int pageNumber) {
		if (this.password.equals(password)) {
			super.deleteText(pageNumber);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}

	}

	public void printPages(String password) {
		if (this.password.equals(password)) {
			super.printNotes();
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}

	}

	public void printPage(String password, int pageNumber) {
		if (this.password.equals(password))
			super.printNote(pageNumber);
		else
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
	}
	
/*	public boolean checkPassword() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter password: ");
		String pass = in.next();
		if (password.equals(pass)) {
			in.close();
			return true;			
		} else {
			in.close();
			return false;
		}
	}*/

}



