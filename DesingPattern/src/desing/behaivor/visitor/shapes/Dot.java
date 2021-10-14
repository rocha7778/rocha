package desing.behaivor.visitor.shapes;

public class Dot implements Shape {
	
	
	private int x;
	private int y;
	
	public Dot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Dot() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Moving point");

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw point x: "+x + "y: "+y);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
