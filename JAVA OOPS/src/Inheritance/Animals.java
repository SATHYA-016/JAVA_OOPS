package Inheritance;

public class Animals {

	private boolean vegetarian;

	private String eats;

	private int no_Of_Legs;


	public Animals(boolean veg, String food, int legs){
		this.vegetarian = veg;
		this.eats = food;
		this.no_Of_Legs = legs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return no_Of_Legs;
	}

	public void setNoOfLegs(int no_Of_Legs) {
		this.no_Of_Legs = no_Of_Legs;
	}

}

