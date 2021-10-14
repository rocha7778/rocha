package desing.structural.proxy;

public class ProxyCompany implements Buyer {

	private Buyer buyer;

	public ProxyCompany(Buyer buyer) {
		this.buyer = buyer;
	}

	@Override
	public void buyHouse() {
		System.out.println("Prepare information and pay deposit");
		buyer.buyHouse();
		System.out.println("Decoration and settled");

	}

	@Override
	public void buyCar() {
		System.out.println("Determine the model of car and pay the deposit");
		buyer.buyCar();
		System.out.println("Pick up the car and go home");
	}

}
