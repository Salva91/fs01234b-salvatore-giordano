package epicode.it.pizza;

import lombok.Getter;

@Getter
public abstract class Item {

	protected int calories;
	protected double price;

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

	public Double getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}

