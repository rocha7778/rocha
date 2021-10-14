package desing.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class City extends Node2{

	public City(String name) {
		super(name);
	}

	@Override
	public List<Node2> getChildNodes() {
		return new ArrayList<Node2>();
	}

	@Override
	public boolean isRoot() {
		return false;
	}

}
