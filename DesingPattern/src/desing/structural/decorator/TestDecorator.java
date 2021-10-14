package desing.structural.decorator;

public class TestDecorator {
	
	public static void main(String args []) {
		
		Person p = new Man();
		p.showRole();
		System.out.println("-----------------------");
		
		p = new ManagerDecorater(p);
		p.showRole();
		System.out.println("-----------------------");
		
		
		p = new ActorDecorator(p);
		p.showRole();
		System.out.println("-----------------------");
		
		
		p = new FatherDecorator(p);
		p.showRole();
		
		
		
		
		
	}

}
