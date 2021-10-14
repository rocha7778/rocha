package desing.creational.factory;

public class TestFatory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = Factory.create(0);
		p.print();
		
		p= Factory.create(1);
		p.print();
				

	}

}
