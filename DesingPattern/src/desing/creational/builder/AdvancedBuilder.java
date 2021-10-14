package desing.creational.builder;

public class AdvancedBuilder implements Builder {
	
	private Car car = null;

	public AdvancedBuilder() {
		car = new Car();
	}

	@Override
	public void buildHead() {
		car.setHead("Mercedes-Benz's head has been completed");

	}

	@Override
	public void buildBody() {
		car.setBody("Mercedes-Benz's body has been completed");

	}

	@Override
	public void buildWheel() {
		car.setWheel("Mercedes-Benz's wheel has been completed");
	}
	
	public Car buildPart() {
		return car;
	}

}
