public class SecuredNotepad extends SimpleNotepad {
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
	public void addText(int pageNumber, String text) {
		System.out.println("You are not authorized to perform this operation2");
	}
	@Override
	public void rewritePage(int pageNumber, String text) {
		System.out.println("You are not authorized to perform this operation3");
	}
	@Override
	public void deletePageText(int pageNumber) {
		System.out.println("You are not authorized to perform this operation4");
	}
	@Override
	public void printPage(int pageNumber) {
		System.out.println("You are not authorized to perform this operation5");
	}
	@Override
	public void printPages() {
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
			super.addText(pageNumber, text);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}
	}

	public void rewritePage(String password, int pageNumber, String text) {
		if (this.password.equals(password)) {
			super.deletePageText(pageNumber);
			super.addText(pageNumber, text);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}
	}

	public void deletePageText(String password, int pageNumber) {
		if (this.password.equals(password)) {
			super.deletePageText(pageNumber);
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}

	}

	public void printPages(String password) {
		if (this.password.equals(password)) {
			super.printPages();
		} else {
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
		}

	}

	public void printPage(String password, int pageNumber) {
		if (this.password.equals(password))
			super.printPage(pageNumber);
		else
			System.out
					.println("Wrong password. You are not authorized to perform this operation");
	}
}
