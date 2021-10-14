package desing.structural.proxy;

public class Client implements Buyer {

	@Override
	public void buyHouse() {
		System.out.println("I want to buy a house");

	}

	@Override
	public void buyCar() {
		System.out.println("I want to buy a car");

	}

}
