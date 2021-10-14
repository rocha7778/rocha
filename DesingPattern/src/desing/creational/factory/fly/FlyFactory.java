package desing.creational.factory.fly;

public class FlyFactory {
	
	public static Fly creator(int type) {
		
		Fly fly = null;
		
		if(type==1) {
			
			fly = new Banshee();
		}
		if(type==2) {
			
			fly = new B747Fly();
		}
		if(type==3) {
			
			fly = new A380Fly();
		}
		
		return fly;
	}

}
