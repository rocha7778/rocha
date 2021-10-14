package desing.behaivor.visitor.shapes;

public class Circle extends Dot {

	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Moving Circle");

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Painting circle");
	}

}
