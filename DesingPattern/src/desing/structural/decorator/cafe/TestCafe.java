package desing.structural.decorator.cafe;

public class TestCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cafe tc  = new  TraditionalCafe();
		
		tc.description();
		System.out.println("Cost of traditional cafee is "+ tc.cost());
		System.out.println("-----------------------");
		
		tc = new MilkDecorator(tc);
		
		tc.description();
		System.out.println("Cost of traditional cafee plus milk is "+ tc.cost());
		System.out.println("-----------------------");
		
		
		tc = new HoneyDecorator(tc);
		tc.description();
		System.out.println("Cost of traditional cafee plus milk, plus honey is "+ tc.cost());
		System.out.println("-----------------------");

	}

}
