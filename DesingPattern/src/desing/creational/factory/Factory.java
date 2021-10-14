package desing.creational.factory;

public class Factory {
	
	
	
	public static Product create (int type) {
		Product p = null;
		
		if(type==0) {
			p = new Computer();
		}
		
		if(type==1) {
			p = new Mause();
		}
		return p;
	}

}
