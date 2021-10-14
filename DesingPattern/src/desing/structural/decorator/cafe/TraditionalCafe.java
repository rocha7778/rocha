package desing.structural.decorator.cafe;

public class TraditionalCafe implements Cafe {

	@Override
	public void description() {
		System.out.println("Tradicional coffe");

	}

	@Override
	public double cost() {
		return 1;
	}

}
