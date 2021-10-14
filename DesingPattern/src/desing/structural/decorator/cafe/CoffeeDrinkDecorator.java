package desing.structural.decorator.cafe;

public abstract class CoffeeDrinkDecorator implements Cafe{
	
	protected Cafe cafe;

	public CoffeeDrinkDecorator(Cafe cafe) {
		this.cafe = cafe;
	}

}
