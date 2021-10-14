package desing.behaivor.strategy.without.pay;

public class Paypal implements Payment {

	@Override
	public void payment() {
		System.out.println("Payment with Paypal");
	}

}
