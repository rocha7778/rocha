package desing.behaivor.strategy;

public class TestStrategy {
	
	public static void main(String args []) {
		
		Context c = new Context(new Addition());
		double result = c.doCalculate(4,2);
		System.out.println("Addition--> (4+2) = "+result);
		
		c = new Context(new Subtraction());
		result = c.doCalculate(4,2);
		System.out.println("Subtraction--> (4-2) = "+result);
		
	}

}
