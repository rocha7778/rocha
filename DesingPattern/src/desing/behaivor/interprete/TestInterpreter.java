package desing.behaivor.interprete;

public class TestInterpreter {

	public static void main(String[] args) {
		
		Constant c1 = new Constant(5);
		Constant c2 = new Constant(3);
		Constant c3 = new Constant(6);
		Constant c4 = new Constant(2);
		
		Expresion exp = new Add(new Add(c1,c2), new Sub(c3,c4));
		
		System.out.println(exp.toString()+"="+exp.interpret());

	}

}
