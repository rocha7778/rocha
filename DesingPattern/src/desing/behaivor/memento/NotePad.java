package desing.behaivor.memento;

import java.util.Stack;

public class NotePad {
	
	private Stack<Memento> mementos;
	private int index;
	
	
	
	public NotePad() {
		mementos = new Stack<Memento>();
	}

	public void push(Memento memento) {
		mementos.add(memento);
		index++;
	}
	
	public Memento redo() {
		Memento memento = mementos.get(index);
		index++;
		return memento;
		
	}
	
	public Memento undo() {
		index--;
		Memento memento = mementos.get(index);
		return memento;
	}

}
