package pizza.topping;

public class PepperTopping extends VeggieTopping {
	public String toString() {
		return "Pepper Topping";
	}

	@Override
	public double getPrice() {
		return 5.00;
	}
}
