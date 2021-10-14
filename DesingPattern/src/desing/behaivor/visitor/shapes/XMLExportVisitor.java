package desing.behaivor.visitor.shapes;


public class XMLExportVisitor implements Visitor {
	
	public String export(Shape ... args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
		
		
		
		return "";
		
	}

	@Override
	public String visitDot(Dot dot) {
		 return "<dot>" + "\n" +
	                "    <x>" + dot.getX() + "</x>" + "\n" +
	                "    <y>" + dot.getY() + "</y>" + "\n" +
	                "</dot>";
	}

	@Override
	public String visitCircle(Circle c) {
		 return "<circle>" + "\n" +
	                "    <x>" + c.getX() + "</x>" + "\n" +
	                "    <y>" + c.getY() + "</y>" + "\n" +
	                "    <radius>" + c.getRadius() + "</radius>" + "\n" +
	                "</circle>";
	}

	@Override
	public String visitRectangle(Rectangle r) {
		 return "<rectangle>" + "\n" +
	                "    <x>" + r.getX() + "</x>" + "\n" +
	                "    <y>" + r.getY() + "</y>" + "\n" +
	                "    <width>" + r.getWidth() + "</width>" + "\n" +
	                "    <height>" + r.getHeight() + "</height>" + "\n" +
	                "</rectangle>";
	}


}
