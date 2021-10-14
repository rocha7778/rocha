package desing.structural.composite;

public class Tree {
	
	private Node root;
	protected String name;
	
	public Tree(String name) {
		super();
		this.root = new Node(name);
	}
	
	public Node getRoot() {
		return root;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
