
public interface INotepad {

	void addText(int pageNumber, String text);
	void rewritePage(int pageNumber, String text);
	void deletePageText(int pageNumber);
	void printPages();
}
