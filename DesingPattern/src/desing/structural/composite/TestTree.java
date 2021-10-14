package desing.structural.composite;

import java.util.List;
import java.util.ListIterator;

public class TestTree {

	public static void main(String[] args) {

		TestTree t = new TestTree();

		Tree tree = new Tree("World");
		Node root = tree.getRoot();
		Node china = new Node("China");
		Node america = new Node("America");

		root.add(china);
		root.add(america);

		Node beijing = new Node("Bei Jing");
		Node shangai = new Node("Shang Hai");

		china.add(beijing);
		china.add(shangai);

		Node sanfranciso = new Node("San Fransico");
		Node newYork = new Node("New York");

		america.add(sanfranciso);
		america.add(newYork);

		t.print(root);

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

	public void print(Node node) {

		System.out.println("Node value: " + node.getName());

	}

}
