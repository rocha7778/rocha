package desing.behaivor.strategy;

public class Context {

	Strategy strategy;
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public double doCalculate(double a, double b) {
		return strategy.calculate(a, b);
	}
}
