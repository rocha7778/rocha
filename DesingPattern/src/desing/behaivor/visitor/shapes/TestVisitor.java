package desing.behaivor.visitor.shapes;

import java.util.ArrayList;
import java.util.List;

public class TestVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dot dot = new Dot();
		dot.setX(5);
		dot.setY(5);
		
		Circle circle = new Circle(5,5,3);
		Rectangle rectangle = new Rectangle(5, 5, 10, 5);
		
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(dot);
		shapes.add(circle);
		shapes.add(rectangle);
		
		
		for (Shape shape : shapes) {
			shape.draw();
			shape.move(3, 5);
			
		}
		
		XMLExportVisitor xmlExport = new XMLExportVisitor();
		
		String circleInXmlFormat =  xmlExport.visitCircle(circle);
		
		System.out.println(circleInXmlFormat);
		
		
		
		

	}

}
