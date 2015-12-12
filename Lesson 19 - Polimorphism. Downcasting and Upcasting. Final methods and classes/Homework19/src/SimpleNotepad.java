public class SimpleNotepad implements INotepad {

	protected Page[] pages;

	public int getPagesCount() {
		return pages.length;
	}

	public SimpleNotepad(int numberOfpages) {
		if (numberOfpages > 0) {
			this.pages = new Page[numberOfpages];
			for (int i = 0; i < numberOfpages; i++) {
				pages[i] = new Page();
			}
		}else{
			System.out.println("Invalid number of pages");
		}
	}

	public void addHeading(int pageNumber, String heading) {
		if (pageNumber > 0 && pageNumber <= pages.length)
			this.pages[pageNumber - 1].setHeading(heading);
		else
			System.out.println("Can`t perform operation, invalid page number - " + pageNumber);
	}

	@Override
	public void addText(int pageNumber, String text) {
		if (pageNumber > 0 && pageNumber <= pages.length)
			this.pages[pageNumber - 1].addText(text);
		else
			System.out.println("Can`t perform operation, invalid page number - " + pageNumber);
	}

	@Override
	public void rewritePage(int pageNumber, String text) {
		this.pages[pageNumber - 1].deleteText();
		this.addText(pageNumber, text);
	}

	@Override
	public void deletePageText(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= pages.length){
			this.pages[pageNumber - 1].deleteText();
			this.pages[pageNumber - 1].deleteHeading();
		}else
			System.out.println("Can`t perform operation, invalid page number - " + pageNumber);

	}

	@Override
	public void printPages() {
		for (int i = 0; i < pages.length; i++) {
			if (!pages[i].getHeading().equals("")
					|| !pages[i].getText().toString().equals("")) {
				System.out.printf("Page %s\n", i + 1);
				this.pages[i].printPage();
				System.out.println();
			}
		}

	}

	public void printPage(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= pages.length)
		this.pages[pageNumber - 1].printPage();
		else
			System.out.println("Can`t perform operation, invalid page number - " + pageNumber);

	}

	void searchWord(int pageNumber, String word){
		if(pages[pageNumber-1].searchWord(word)){
			System.out.printf("Page %s conteins the word - %s\n",pageNumber,word);
		}else
			System.out.printf("Page %s doesn`t contein the word - %s\n",pageNumber,word);
	}
}
