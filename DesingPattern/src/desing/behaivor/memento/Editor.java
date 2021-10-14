package desing.behaivor.memento;

public class Editor {
	
	private String text;
	
	
	public Memento createMemento() {
		
		return new Memento(text);
	}
	
	public void setMemento(Memento memento){
		
		text = memento.getState();
		
	}
	
	public void show() {
		
		System.out.println(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
