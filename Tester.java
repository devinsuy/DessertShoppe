/**
 * This project will run the software for a Dessert Shoppe that sells candy by the pound, cookies by the dozen, ice cream, 
 * and sundaes (ice cream with a topping). The first part of this project will allow creation of different items that can
 * be added to a checkout list. Once items have been added to the check, the checkout will finalize and print out all the
 * details of the purchase with all the costs. The second part of this project will utilize a method called max() found in
 * DessertItem that implements Comparable to compare caloric values of different dessert items. It will then sort these items 
 * by their calories and print them out in sorted order.
 */
public class Tester {

	public static void main(String[] args) {
		DessertItem vanillaIceCream = new IceCream(1.05, "Vanilla");
		DessertItem sbIceCream = new IceCream(1.05, "Strawberry");
		DessertItem pbFudge = new Candy("Peanut Butter Fudge", 2.25, 3.99);
		DessertItem hotFudgeChocChip = new Sundae("Chocolate Chip", 1.05, "Hot Fudge", 0.90);
		DessertItem fourOatmeal = new Cookie(4, 3.99, "Oatmeal");
		
		Checkout check = new Checkout();
		
		check.enterItem(vanillaIceCream);
		check.enterItem(sbIceCream);
		check.enterItem(pbFudge);
		check.enterItem(hotFudgeChocChip);
		check.enterItem(fourOatmeal);
				
		System.out.println(check);
		System.out.println("Cost of the " + check.numberOfItems() + " item(s) is: " + check.totalCostInDollars() + " OR " + check.totalCost() + " cents");
		System.out.println("Tax at a rate of " + check.getTaxRate() + " is: " + check.totalTaxInDollars() + " OR " + check.totalTax() + " cents") ;
		System.out.println("\nTotal cost is: " + check.totalCostWithTax());
		
		System.out.println("\n\nPART II\n-------------------------------------");
		vanillaIceCream.setCalories(200);
		sbIceCream.setCalories(200);
		pbFudge.setCalories(210);
		hotFudgeChocChip.setCalories(350);
		fourOatmeal.setCalories(300);
		System.out.println(DessertItem.max(vanillaIceCream, sbIceCream) + "\n");
		System.out.println(DessertItem.max(vanillaIceCream, pbFudge) + "\n");
		System.out.println(DessertItem.max(vanillaIceCream, fourOatmeal) + "\n");
		System.out.println(DessertItem.max(fourOatmeal, hotFudgeChocChip) + "\n");
		System.out.println(DessertItem.max(sbIceCream, pbFudge) + "\n");
		System.out.println(DessertItem.max(sbIceCream, sbIceCream) + "\n");
		System.out.println(DessertItem.max(fourOatmeal, pbFudge) + "\n");
		
	
	}
}
