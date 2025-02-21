package pizza;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

import java.util.ArrayList;

/**
 * pizza.Pizza represents a pizza in our application. It holds together all the usual components of pizza like
 * crust, sauce and toppings. For our application, we limit to one crust, one sauce, and multiple toppings.
 */
public class Pizza implements MenuItem {
	private PizzaCrust crust;
	private PizzaSauce sauce;
	private ArrayList<PizzaTopping> toppingList;
	public double price;
	public double total = 0;

	private ArrayList<MenuItem> items;
	
	public Pizza() {
		this.crust = null;
		this.sauce = null;
		this.toppingList = new ArrayList<PizzaTopping>();
		this.items = new ArrayList<MenuItem>();
	}

	public PizzaCrust getCrust() {
		return this.crust;
	}

	public void setCrust(PizzaCrust crust) {
		this.crust = crust;
	}

	public PizzaSauce getSauce() {
		return this.sauce;
	}

	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
	}

	public ArrayList<PizzaTopping> getTopping() {
		return this.toppingList;
	}

	public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
	}

	/**
	 * addTopping appends a new topping to the list of toppings.
	 * @param topping is any valid pizza.topping.PizzaTopping
	 */
	public void addTopping(PizzaTopping topping) {
		this.toppingList.add(topping);
		this.items.add(topping);
	}
	
	public void display() {
		System.out.printf("%s - $%.2f\n", this.crust.toNiceString(), this.crust.getPrice());
		System.out.printf("%s - $%.2f\n", this.sauce.toNiceString(), this.sauce.getPrice());
		for (PizzaTopping t : this.toppingList) {
			//System.out.println(t.toNiceString() + " - $" + t.getPrice());
			System.out.printf("%s - $%.2f\n", t.toNiceString(), t.getPrice());
		}
		for (MenuItem t : this.items) {
		//	System.out.println(t);
			total += t.getPrice();
		}
		System.out.printf("Total: $%.2f\n", total);
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	public void addItems(MenuItem itemAdd) {
		this.items.add(itemAdd);
	}

}
