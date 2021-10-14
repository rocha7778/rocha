package desing.behaivor.strategy.pay;

public class MasterCad extends Pay {

	@Override
	public void pay(double price) {
		System.out.println("Paying with Master card"+price);
	}

}
