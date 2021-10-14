package desing.behaivor.visitor.shapes;

public class Rectangle implements Shape {

	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}


	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Moving Rectangle");


	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Pinting Rectangle");


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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	

}
