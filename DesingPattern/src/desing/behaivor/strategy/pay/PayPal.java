package desing.behaivor.strategy.pay;

public class PayPal extends Pay {

	@Override
	public void pay(double price) {
		System.out.println("Paying with PayPal "+price);
	}

}
