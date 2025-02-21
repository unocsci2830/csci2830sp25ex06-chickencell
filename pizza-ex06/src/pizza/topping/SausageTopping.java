package pizza.topping;

public class SausageTopping extends MeatTopping {
	public String toString() {
		return "Sausage Topping";
	}

	@Override
	public double getPrice() {
		return 6.00;
	}
}
