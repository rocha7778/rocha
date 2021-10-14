package desing.structural.brige;

public class TestBrige {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forma f = new Circulo();
		Color c = new Rojo();
		
		f.descripcion();
		f.getColor().pintar();
		
		Forma fc = new Cuadrado(c);
		fc.descripcion();
		fc.getColor().pintar();
		
		Forma ft = new Triangulo();
		ft.descripcion();
		ft.getColor().pintar();
		
		

	}

}
