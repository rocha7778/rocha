package desing.structural.composite;

import java.util.List;
import java.util.ListIterator;

public class TestTree2 {

	public static void main(String[] args) {

	
		Country world = new Country("world");
		Country china = new Country("China");
		Node2 beijing = new City("Bei Jing");
		Node2 shangai = new City("Shang Hai");
		
		
		
		world.addCity(china);
		china.addCity(beijing);
		china.addCity(shangai);
		
	

		TestTree2.print(world);
	

//		System.out.println(root.getName());
//		
//		List<Node> childNodes = root.getChildNodes();
//		
//		for (Node node : childNodes) {
//			
//			System.out.println("----"+node.getName());
//			
//			List<Node> childNodes2 = node.getChildNodes();
//			
//			for (Node node2 : childNodes2) {
//				
//				System.out.println("--------"+node2.getName());
//				
//			}
//		}
	}

	public static void print(Node2 node) {

		System.out.println("Node value: " + node.getName());
		if(node.isRoot()) {
            for (Node2 f:node.getChildNodes()) {
            	print(f);
            }
        }

	}

}
