package desing.structural.brige;

public class Triangulo extends Forma{

	@Override
	public void descripcion() {
		System.out.println("Soy un triangulo");
	}
	
	@Override
	public Color getColor() {
		return new NoColor();
	}

}
