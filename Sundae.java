
public class Sundae extends IceCream{
	
	private String topping;
	private double toppingsPrice;
	private int calories;
	
	public Sundae(String flavor, double iceCreamPrice, String topping, double toppingsPrice) {
		super(iceCreamPrice, flavor);
		this.topping = topping;
		this.toppingsPrice = toppingsPrice;
	}
	
	public String getTopping() {
		return topping;
	}
	
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String toString() {
		System.out.println(topping + " Sundae with");
		return super.toString();
	}
	
	public double getCost() {
		double sundaePrice = toppingsPrice + getIceCreamPrice();
		return roundPrice(sundaePrice);
	}
	
}
