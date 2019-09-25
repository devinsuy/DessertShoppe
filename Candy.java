
public class Candy extends DessertItem{

	private double weight;
	private double unitPrice; // Price per pound
	private int calories;
	
	public Candy(String name, double weight, double unitPrice) {
		super(name);
		this.weight = weight;
		this.unitPrice = unitPrice;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public double getCost() {
		double candyCost = weight * unitPrice;
		return roundPrice(candyCost);
	}
	
	public String toString() {
		System.out.println(weight + " lbs @ " + unitPrice + " /lb");
		return super.getName();
	}
	
}
