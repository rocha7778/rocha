package desing.behaivor.flyweight;

public class TestFlyweight {

	static CarFactory carFactory = new CarFactory();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 1; x < 100; x = x + 1) {
			
	          Car car1 = carFactory.getCar(random());
	          System.out.println("A " +car1.getName() + " car was drawn in position (x, y)=("+x+",10)");
	       }
	}
	
	 private static String random() {
		 
		 String [] carType  = {"Chevrolet","BMW","Renault","Standard"};
	       int index =  (int) (Math.random() * 4);
	       return carType[index];
	    }

}
