/**
 * Michell Kuang
 * Devin Suy
 * Assignment 2
 * 
 */
import java.util.*;

public class Checkout {

	private double taxRate = 0.065;
	private ArrayList<DessertItem> items;
	
	public Checkout() {
		items = new ArrayList <DessertItem>(); // Initializes empty array list
	}
	
	public void clear() {
		items.clear();
	}
	
	public void enterItem(DessertItem item) {
		items.add(item);
	}
	
	public int numberOfItems() {
		return items.size();
	}
	
	public String toString() {
		System.out.println("\tDevell Dessert Shoppe\t");
		System.out.println("-------------------------------------");
		for (int i = 0; i < items.size(); i++) {
			DessertItem item = items.get(i);
			System.out.printf("%-25s %10s %n", item.toString(), item.getCost());
		}
		System.out.printf("%n%n%-25s %10s %n", "Tax", totalTaxInDollars());
		System.out.printf("%-25s %10s %n", "Total Cost", totalCostWithTax());
		return "";
	}
		
	public int totalCost() { // Returns total cost before tax in CENTS
		double totalCost = 0;
		for(int i = 0; i < items.size(); i++) { // Iterates through items, incrementing price accordingly
			DessertItem temp = items.get(i);
			totalCost += temp.getCost();
		}
		return (int) (totalCost * 100);
	}
	
	public double totalCostInDollars() { // Returns total cost before tax in DOLLARS
		double totalCostInDollars = totalCost() / 100.0;
		return totalCostInDollars;
	}
	
	public int totalTax() { // Returns total tax in CENTS
		double unroundedTaxInCents = (taxRate * totalCostInDollars()) * 100;
		int roundedTaxInCents = (int) unroundedTaxInCents;
		if ((unroundedTaxInCents - roundedTaxInCents) >= 0.5) { // If thousands place of price is >= 5, rounds up 1 cent
			roundedTaxInCents++;
		}
		
		return roundedTaxInCents;
	}
	
	public double totalTaxInDollars() { // Returns total tax in DOLLARS
		double taxInDollars = totalTax() / 100.0;
		return taxInDollars;
	}
	
	public double totalCostWithTax() { // Returns total cost in DOLLARS
		return (totalCostInDollars() + totalTaxInDollars());
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public void sort() {
		
	}

	
}
