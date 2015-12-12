

public class SimpleNotepad implements INotepad {

	private Note[] notes;

	public int getPagesCount() {
		return notes.length;
	}

	public SimpleNotepad(int numberOfPages) {
		super();
		if (numberOfPages > 0) {
			this.notes = new Note[numberOfPages];
			for (int i = 0; i < numberOfPages; i++) {
				notes[i] = new Note();
			}
		} else {
			System.out.println("Invalid number of pages");
		}
	}

	public void addHeading(int pageNumber, String title) {
		if (pageNumber > 0 && pageNumber <= notes.length)
			this.notes[pageNumber - 1].setTitle(title);
		else
			System.out
					.println("Can`t perform operation, invalid page number - "
							+ pageNumber);
	}

	public void addText(String text, int pageNumber) {
		if (pageNumber > 0 && pageNumber <= notes.length)
			this.notes[pageNumber - 1].addText(text);
		else
			System.out
					.println("Can`t perform operation, invalid page number - "
							+ pageNumber);
	}

	public void replaceText( String text, int pageNumber) {
		this.notes[pageNumber - 1].deleteText();
		this.addText(text, pageNumber);
	}

	public void deleteText(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= notes.length) {
			this.notes[pageNumber - 1].deleteText();
			this.notes[pageNumber - 1].deleteHeading();
		} else
			System.out
					.println("Can`t perform operation, invalid page number - "
							+ pageNumber);

	}

	public void printNotes() {
		for (int i = 0; i < notes.length; i++) {
			if (!notes[i].getTitle().equals("")
					|| !notes[i].getText().toString().equals("")) {
				System.out.printf("Page %s\n", i + 1);
				this.notes[i].readNote();
				System.out.println();
			}
		}

	}

	public void printNote(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= notes.length)
			this.notes[pageNumber - 1].readNote();
		else
			System.out
					.println("Can`t perform operation, invalid page number - "
							+ pageNumber);

	}

	void searchWord(int pageNumber, String word) {
		if (notes[pageNumber - 1].searchWord(word)) {
			System.out.printf("Page %s conteins the word - %s\n", pageNumber,
					word);
		} else
			System.out.printf("Page %s doesn`t contein the word - %s\n",
					pageNumber, word);
	}

}
