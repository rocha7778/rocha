package desing.behaivor.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebServer {

	private List<Web> elements = new ArrayList<Web>();
	
	public void attach(Web element) {
		elements.add(element);
	}
	
	public void detach(Web element) {
		elements.remove(elements);
	}
	
	public void accept(Visitor visitor) {
		
		for(Web web:elements) {
			web.accept(visitor);
		}
	}
}
