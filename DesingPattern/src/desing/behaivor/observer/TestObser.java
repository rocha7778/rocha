package desing.behaivor.observer;

public class TestObser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StockData stockData = new StockData(16.9F);
		Buyer buyer = new Buyer(stockData);
		Seller sellect = new Seller(stockData);
		
		stockData.upDatePrice(18.9f);
		
		System.out.println("------------------------------------");
		
		stockData.upDatePrice(12.9f);
		
		
		
		

	}

}
