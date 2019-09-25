
public class IceCream extends DessertItem{
	
	private double iceCreamPrice;
	private int calories;
	private String flavor;
	
	public IceCream(double iceCreamPrice, String flavor) {
		this.iceCreamPrice = iceCreamPrice;
		this.flavor = flavor;
	}
	
	public double getIceCreamPrice() {
		return iceCreamPrice;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public double getCost() {
		return roundPrice(iceCreamPrice);
	}
	
	public String toString() {
		return flavor + " Ice Cream";
	}

}
