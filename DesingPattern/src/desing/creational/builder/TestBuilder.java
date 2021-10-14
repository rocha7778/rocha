package desing.creational.builder;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = Assembler.construct(new StandardBuilder());
		System.out.println(car.getHead());
		System.out.println(car.getBody());
		System.out.println(car.getWheel());
		
		System.out.println("------");
		
		
		car = Assembler.construct(new AdvancedBuilder());
		
		
		System.out.println(car.getHead());
		System.out.println(car.getBody());
		System.out.println(car.getWheel());
		
		
		
		

	}

}
