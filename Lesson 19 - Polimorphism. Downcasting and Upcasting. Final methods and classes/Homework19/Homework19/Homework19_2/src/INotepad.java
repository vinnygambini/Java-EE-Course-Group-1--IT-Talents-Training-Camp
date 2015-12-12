

public interface INotepad {
	
	public void addText(String text, int numberOfPage);
	
	public void replaceText(String text, int numberOfPage);
	
	public void deleteText(int numberOfPage);
	
	public void printNotes();

}
