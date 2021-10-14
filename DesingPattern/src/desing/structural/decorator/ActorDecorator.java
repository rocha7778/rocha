package desing.structural.decorator;

public class ActorDecorator extends Decorator{

	public ActorDecorator(Person p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showRole() {
		// TODO Auto-generated method stub
		p.showRole();
		System.out.println("I am still an international actor");
		
	}

}
