package pizza.topping;

public class MushroomTopping extends VeggieTopping {
	public String toString() {
		return "Mushroom Topping";
	}

	@Override
	public double getPrice() {
		return 3.00;
	}

}
