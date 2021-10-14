package desing.behaivor.strategy.pay;

public class PayManager {

	private Pay pay;

	public PayManager(Pay pay) {
		super();
		this.pay = pay;
	}
	
	public void doPay (double price) {
		pay.pay(price);
	}
}
