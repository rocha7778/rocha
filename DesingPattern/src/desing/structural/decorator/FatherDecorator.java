package desing.structural.decorator;

public class FatherDecorator extends Decorator {

	public FatherDecorator(Person p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showRole() {
		p.showRole();
		System.out.println("I am still a Father");

	}

}
