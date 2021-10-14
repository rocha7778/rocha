package desing.behaivor.command;

public class CommandTest {

	public static void main(String[] args) {
		Stock stock = new Stock();
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.placeOrdrs();

	}

}
