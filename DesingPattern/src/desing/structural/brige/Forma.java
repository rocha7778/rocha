package desing.structural.brige;

public abstract class Forma {
	
	protected Color c;

	public Forma(Color c) {
		super();
		this.c = c;
	}
	
	public Forma() {
		
	}
	
	public abstract void descripcion();
	public void setColor(Color c) {
		this.c=c;
	}
	
	public Color getColor() {
		return this.c;
	}
	
}
