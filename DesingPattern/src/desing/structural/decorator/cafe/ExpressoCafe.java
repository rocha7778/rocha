package desing.structural.decorator.cafe;

public class ExpressoCafe implements Cafe {

	@Override
	public void description() {
		System.out.println("Expresso coffe");

	}

	@Override
	public double cost() {
		return 2;
	}

}
