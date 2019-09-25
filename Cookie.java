
public class Cookie extends DessertItem{

	private String flavor;
	private int numCookies;
	private double dozenPrice;
	private int calories;
	
	public Cookie(int numCookies, double dozenPrice, String flavor) {
		this.numCookies = numCookies;
		this.dozenPrice = dozenPrice;
		this.flavor = flavor;
	}
	
	public int getCalories() {
		return calories;
	}	
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public double getCost() {
		double unitPrice = dozenPrice / 12; // Cost of a single cookie
		double cookieCost = unitPrice * numCookies;
		return roundPrice(cookieCost);
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public String toString() {
		System.out.println(numCookies + " @ " + dozenPrice + " /dz");
		return flavor + " Cookies";
	}
}
