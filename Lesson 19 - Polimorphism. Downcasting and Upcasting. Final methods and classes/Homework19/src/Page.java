
public class Page {
	private String heading;
	private StringBuilder text;
	

	public Page() {
		this.heading = new String();
		this.text = new StringBuilder();
	}
	
	
	public String getHeading() {
		return heading;
	}
	
	public void setText(StringBuilder text) {
		this.text = text;
	}


	public StringBuilder getText() {
		return text;
	}

	void addText(String text){
		this.text.append(text);
	}
	
	void deleteHeading(){
		this.heading = "";
	}
	
	void deleteText(){
		this.text = new StringBuilder();
	}
	
	public void setHeading(String heading) {
		this.heading = heading;
	}
	
	void printPage(){
		String pageContent = "Heading: "+ this.heading + "\n" + "Text: " + this.text;
		System.out.println(pageContent);
	}
	
	boolean searchWord(String word){
		if(this.text.indexOf(word)>=0){
			return true;
		}else{
			return false;	
		}
	}
}
