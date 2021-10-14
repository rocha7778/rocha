package desing.creational.builder;

public class StandardBuilder implements Builder {

	private Car car = null;

	public StandardBuilder() {
		car = new Car();
	}

	@Override
	public void buildHead() {
		car.setHead("Honda's head has been completed");
	}

	@Override
	public void buildBody() {
		car.setBody("Honda's body has been completed");
		
	}

	@Override
	public void buildWheel() {
		car.setWheel("Honda's wheel has been completed");
	}
	
	
	public Car buildPart() {
		return car;
	}

}
