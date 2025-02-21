package pizza.sauce;


import pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
	public abstract String toString();
	public double price;
	
	public String toNiceString() {
		return "Sauce: " + this.toString();
	}

	@Override
	public double getPrice() {
		return this.price;
	}
	
}
