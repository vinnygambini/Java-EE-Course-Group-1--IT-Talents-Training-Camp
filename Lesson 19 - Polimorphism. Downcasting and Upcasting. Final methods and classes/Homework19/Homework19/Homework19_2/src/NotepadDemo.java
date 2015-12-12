


public class NotepadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		Note myPage = new Note();
		myPage.addText("Introduction to Java book");
		myPage.setTitle("First java book");
		System.out.println(myPage.searchWord("Java"));
		myPage.readNote();
		
		SecuredNotepad mySecureNotepad = new SecuredNotepad(10, "pass");
		mySecureNotepad.addPageHeading("pass", 10, "SecurePage 10");
		mySecureNotepad.addText("pass", 10, "This is a secure page");
		mySecureNotepad.addPageHeading("bass", 9, "SecurePage 10");
		mySecureNotepad.addText("bass", 9, "This is a secure page");
		mySecureNotepad.addPageHeading("pass", 0, "SecurePage 10");
		mySecureNotepad.addText("pass", 0, "This is a secure page");
		mySecureNotepad.printPages("pass");*/
		
		SimpleNotepad mySimpleNotepad = new SimpleNotepad(10);
		mySimpleNotepad.addHeading(1, "First Page");
		mySimpleNotepad.addText("Once upon a time,not long ago..", 1);
		mySimpleNotepad.addHeading(2, "Second Page");
		mySimpleNotepad.addText("This is my second page", 2);
		mySimpleNotepad.addHeading(9, "Ninth Page");
		mySimpleNotepad.addText( "This is my ninth page", 9);
		mySimpleNotepad.addText("Introduction to Java book", 5);
		mySimpleNotepad.addHeading(5,"First java book");
		mySimpleNotepad.addHeading(20, "Twenth Page");
		mySimpleNotepad.addText("\n some new text to page ", 20);
		mySimpleNotepad.printNotes();
		mySimpleNotepad.searchWord(5,"Heavy Metal");
		System.out.println();

		mySimpleNotepad.replaceText("This is my first overwritten page", 1);
		mySimpleNotepad.deleteText(2);
		mySimpleNotepad.addText("\n Add this text to page 9", 9);
		mySimpleNotepad.printNotes();
		mySimpleNotepad.searchWord(9, "Add");	
		
	}

}
