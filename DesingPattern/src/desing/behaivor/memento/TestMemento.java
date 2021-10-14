package desing.behaivor.memento;

public class TestMemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotePad notepad = new NotePad();
		Editor editor = new Editor();
		
		editor.setText("Move you in the direction of your dream");
		notepad.push(editor.createMemento());
		
		editor.setText("ways to start your day positively");
		notepad.push(editor.createMemento());
		
		// undo
		
		System.out.println("------------------------------------");
		editor.setMemento(notepad.undo());
		editor.show();
		editor.setMemento(notepad.undo());
		editor.show();
		
		System.out.println("------------------------------------");
		// redo
		
		editor.setMemento(notepad.redo());
		editor.show();
		editor.setMemento(notepad.redo());
		editor.show();
		
		

	}

}
