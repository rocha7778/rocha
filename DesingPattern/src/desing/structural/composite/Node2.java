package desing.structural.composite;

import java.util.List;

public abstract class Node2 {
	
	protected String name;
	protected List<Node2> childNodes;
	
	
	public Node2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	
	public abstract List<Node2> getChildNodes();
	public abstract boolean isRoot() ;
	
	

}
