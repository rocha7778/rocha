 package desing.behaivor.strategy.pay;

public class VisaCard extends Pay{

	@Override
	public void pay(double price) {
		System.out.println("Paying with Visa card"+price);
	}

}
