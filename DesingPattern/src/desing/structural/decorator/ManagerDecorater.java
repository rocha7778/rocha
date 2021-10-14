package desing.structural.decorator;

public class ManagerDecorater extends Decorator{

	public ManagerDecorater(Person p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showRole() {
		p.showRole();
		System.out.println("I am still a manager");
		
	}

}
