package desing.structural.decorator.cafe;

public class HoneyDecorator extends CoffeeDrinkDecorator {

	public HoneyDecorator(Cafe cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void description() {
		cafe.description();
		System.out.println("Honey was added");
		
	}

	@Override
	public double cost() {
		return this.cafe.cost()+2.5;
	}

}
