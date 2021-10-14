package desing.structural.brige;

public class Circulo extends Forma{

	public Circulo(Color c) {
		super(c);
		
	}
	
	public Circulo() {
	}
	

	@Override
	public void descripcion() {
		System.out.println("Soy un circulo");
		
	}
	
	public void setColor(Color c) {
		this.c=c;
	}
	
	@Override
	public Color getColor() {
		return new NoColor();
	}

}
