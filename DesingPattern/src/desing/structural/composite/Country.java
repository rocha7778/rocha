package desing.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Country extends Node2{

	private List<Node2> nodes = new ArrayList<>();
	
	public Country(String name) {
		super(name);
		this.childNodes = new ArrayList<Node2>();
	}
	
	
	
	public List<Node2> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node2> nodes) {
		this.nodes = nodes;
	}

	

	@Override
	public List<Node2> getChildNodes() {
		return nodes;
	}

	@Override
	public boolean isRoot() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	public void addCity(Node2 node) {
		nodes.add(node);
		
	}

}
