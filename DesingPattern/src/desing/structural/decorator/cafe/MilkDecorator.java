package desing.structural.decorator.cafe;

public class MilkDecorator extends CoffeeDrinkDecorator {

	public MilkDecorator(Cafe cafe) {
		super(cafe);
		
	}

	@Override
	public void description() {
		cafe.description();
		System.out.println("Milk was added");
		
	}

	@Override
	public double cost() {
		return this.cafe.cost() + 1;
	}

}
