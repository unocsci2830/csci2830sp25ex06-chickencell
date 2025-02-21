package pizza.topping;

public class PepperoniTopping extends MeatTopping {
	public String toString() {
		return "Pepperoni Topping";
	}

	@Override
	public double getPrice() {
		return 4.00;
	}
}
