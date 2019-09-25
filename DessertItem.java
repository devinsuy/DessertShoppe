/**
 * Michell Kuang
 * Devin Suy
 * Assignment 2
 * 
 */

public abstract class DessertItem implements Comparable {

  protected String name;

  /**
   * Null constructor for DessertItem class
   */
  public DessertItem() {
    this("");
  }
  
  /**
   * Initializes DessertItem data
   */
  public DessertItem(String name) {
      this.name = name;
      }
  
  /**
   * Returns name of DessertItem
   * @return name of DessertItem
   */
  public final String getName() {
    return name;
  }
  
  /**
   * Returns item calories
   * @return item calories
   */
  public abstract int getCalories(); // Defined in sub classes
  /**
  * Returns item calories
  * @return item calories
  */
 public abstract void setCalories(int calories); // Defined in sub classes
  /**
   * @param unroundedPrice The value to be rounded
   * @return The price rounded to the nearest cent
   */
  public double roundPrice(double unroundedPrice) {
	  double unroundedPriceInCents = unroundedPrice * 100; // Converts value to cents
	  int price = (int)unroundedPriceInCents; // Truncates decimal portion
	  double roundedPrice = (double)(price) / 100; // Converts rounded value back to dollars
	  
	  if ((unroundedPrice - roundedPrice) >= 0.005) { // If thousands place of price is >= 5, rounds up 1 cent
		  roundedPrice += 0.01;
	  }
	  
	  return roundedPrice;
  }
  
/**
 * Returns cost of DessertItem
 * @return cost of DessertItem
 */
  public abstract double getCost(); // Defined in sub classes
  
  
  public int compareTo(Object o) {
		if (o instanceof DessertItem) {
			DessertItem item = (DessertItem) o;
			return this.getCalories()- item.getCalories();
		}
		return 0;
	}
  
  public static DessertItem max(DessertItem item1, DessertItem item2) {
	  System.out.print(item1 + " COMPARED TO\n");
	  System.out.print(item2 + ":\n");
	  int compare = item1.compareTo(item2);
	  if (compare < 0) {
		  return item2;
	  } else if (compare > 0) {
		  return item1;
	  } else {
		  if (item1.equals(item2)) {
			  System.out.println("***Items are the same");
		  }
		  System.out.println("Caloric values are EQUAL");
		  return item1;  
	  }
  }

}