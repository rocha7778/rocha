package desing.structural.proxy;

public class TestProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer buyer = new Client();
		ProxyCompany pc = new ProxyCompany(buyer);
		pc.buyHouse();
		System.out.println("---------------------------");
		pc.buyCar();

	}

}
