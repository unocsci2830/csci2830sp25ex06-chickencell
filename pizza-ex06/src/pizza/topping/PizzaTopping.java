package pizza.topping;

import pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem {
	public abstract String toString();
	public double price;
	
	public String toNiceString() {
		return "Topping: " + this.toString();
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
