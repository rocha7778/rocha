package desing.behaivor.strategy.without.pay;

public class PaymentModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment p = new Paypal();
		p.payment();

		p = new Bancolombia();
		p.payment();

	}

}
