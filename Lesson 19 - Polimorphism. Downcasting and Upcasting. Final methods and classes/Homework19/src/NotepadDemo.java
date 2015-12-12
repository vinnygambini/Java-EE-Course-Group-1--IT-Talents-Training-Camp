public class NotepadDemo {

	public static void main(String[] args) {

//		Page myPage = new Page();
//		myPage.addText("Introduction to Java book");
//		myPage.setHeading("First java book");
//		System.out.println(myPage.searchWord("Java"));
//		myPage.printPage();
		
//		SecuredNotepad mySecureNotepad = new SecuredNotepad(10, "pass");
//		mySecureNotepad.addPageHeading("pass", 10, "SecurePage 10");
//		mySecureNotepad.addText("pass", 10, "This is a secure page");
//		mySecureNotepad.addPageHeading("bass", 9, "SecurePage 10");
//		mySecureNotepad.addText("bass", 9, "This is a secure page");
//		mySecureNotepad.addPageHeading("pass", 0, "SecurePage 10");
//		mySecureNotepad.addText("pass", 0, "This is a secure page");
//		mySecureNotepad.printPages("pass");
//		

		SimpleNotepad mySimpleNotepad = new SimpleNotepad(10);
		mySimpleNotepad.addHeading(1, "First Page");
		mySimpleNotepad.addText(1, "This is my first page");
		mySimpleNotepad.addHeading(2, "Second Page");
		mySimpleNotepad.addText(2, "This is my second page");
		mySimpleNotepad.addHeading(9, "Ninth Page");
		mySimpleNotepad.addText(9, "This is my ninth page");
		mySimpleNotepad.addText(5,"Introduction to Java book");
		mySimpleNotepad.addHeading(5,"First java book");
		mySimpleNotepad.addHeading(20, "Ninth Page");
		mySimpleNotepad.addText(20, "This is my ninth page");
		mySimpleNotepad.printPages();
		mySimpleNotepad.searchWord(5,"Java");
		System.out.println();

		
		mySimpleNotepad.rewritePage(1, "This is my first rewritten page");
		mySimpleNotepad.deletePageText(2);
		mySimpleNotepad.addText(9, "\nAdding this text to page 9");
		mySimpleNotepad.printPages();
		mySimpleNotepad.searchWord(9, "Adding");


	}
}
