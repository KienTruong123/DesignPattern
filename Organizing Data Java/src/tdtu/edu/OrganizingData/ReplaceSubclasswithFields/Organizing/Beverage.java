package tdtu.edu.OrganizingData.ReplaceSubclasswithFields.Organizing;

public class Beverage {
	private String type;

	public Beverage(String type) {
		this.type=type;
	}
	
	public static Beverage createColdDrink() {
		return new Beverage("CD");
	}
	
	public static Beverage createHotDrink() {
		return new Beverage("HD");
	}
	
	public String getType() {
		return type;
	}
}
