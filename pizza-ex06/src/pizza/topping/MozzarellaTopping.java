package pizza.topping;

public class MozzarellaTopping extends CheeseTopping {
	public String toString() {
		return "Mozzarella Topping";
	}

	@Override
	public double getPrice() {
		return 2.00;
	}
}
