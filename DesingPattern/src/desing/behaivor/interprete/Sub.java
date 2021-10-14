package desing.behaivor.interprete;

public class Sub extends Expresion{
	
	private Expresion exp1;
	private Expresion exp2;
	
	

	public Sub(Expresion exp1, Expresion exp2) {
		super();
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	

	@Override
	public int interpret() {
		return exp1.interpret() - exp2.interpret();
	}

	@Override
	public String toString() {
		return "("+exp1.toString()+"-"+exp2.toString()+")";
	}

}
