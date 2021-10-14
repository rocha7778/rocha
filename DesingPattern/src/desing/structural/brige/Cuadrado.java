package desing.structural.brige;

public class Cuadrado extends Forma{

	public Cuadrado(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public Cuadrado() {
		
	}

	@Override
	public void descripcion() {
		System.out.println("Soy un cuadrado");
		
	}
	
	public void setColor(Color c) {
		this.c=c;
	}

}
