package desing.behaivor.interprete;

public class Constant extends Expresion{
	
	private int value;
	
	

	public Constant(int value) {
		super();
		this.value = value;
	}

	@Override
	public int interpret() {
		return value;
	}

	@Override
	public String toString() {
		return new Integer(value).toString();
	}

}
