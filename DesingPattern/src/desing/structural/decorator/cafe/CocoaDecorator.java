package desing.structural.decorator.cafe;

public class CocoaDecorator extends CoffeeDrinkDecorator{

	public CocoaDecorator(Cafe cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void description() {
		System.out.println("Cocoa was added");
		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.cafe.cost() + 1;
	}

}
