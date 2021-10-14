package desing.behaivor.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	
	private static Map<String,Car> carList = new HashMap<String,Car>(); 
	
	public static Car getCar(String type) {
		
		Car car = carList.get(type);
		
		if(car==null) {
			switch(type) {
			case "Chevrolet":
				car = new Chevrolet();
				System.out.println("Creating chevrolet");
				carList.put("Chevrolet", car);
				break;
			case "BMW":
				car = new BMW();
				System.out.println("Creating BMW ");
				carList.put("BMW", car);
				break;
			case "Renault":
				car = new Renault();
				System.out.println("Creating Renault ");
				carList.put("Renault", car);
				break;
			default:
				car = new StandardCar();
				System.out.println("CreatingStandard");
				carList.put("Standard", car);
			}
		}
		return car;
		
	}

}
