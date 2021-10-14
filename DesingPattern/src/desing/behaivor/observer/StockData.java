package desing.behaivor.observer;

import java.util.Observable;

public class StockData extends Observable {
	
	private float price;
	
	public StockData(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}

	public void upDatePrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers();
	}

}
