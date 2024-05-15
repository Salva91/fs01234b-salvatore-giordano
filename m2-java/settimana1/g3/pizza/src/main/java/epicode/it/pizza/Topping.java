package epicode.it.pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping extends Item {
	private String name;

	public Topping(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}


	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getCalories() {
		// TODO Auto-generated method stub
		return 0;
	}
}
