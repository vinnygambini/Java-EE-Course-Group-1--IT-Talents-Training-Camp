

public class Note {
	
	private String title;
	private StringBuilder text;
		
	
	public Note(){
		this.title = new String();
		this.text = new StringBuilder();
	}
	
	public void setText(StringBuilder text) {
		this.text = text;
	}


	public StringBuilder getText() {
		return text;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	void addText(String text){
		this.text.append(text);
	}
	
	void deleteHeading(){
		this.title = "";
	}
	
	void deleteText(){
		this.text = new StringBuilder();
	}
	
	public void readNote(){
		String note = title + "\n" + text;
		System.out.println(note);
	}
	
	boolean searchWord(String word){
		if(this.text.indexOf(word)>=0){
			return true;
		}else{
			return false;	
		}
	}

}
