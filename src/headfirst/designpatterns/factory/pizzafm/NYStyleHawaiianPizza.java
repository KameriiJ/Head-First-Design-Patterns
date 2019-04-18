package headfirst.designpatterns.factory.pizzafm;

public class NYStyleHawaiianPizza extends Pizza {

	public NYStyleHawaiianPizza() {
		name = "NY Style Hawaiian Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Fresh Mozzarella");
		toppings.add("Pie apple");
		toppings.add("Ham");
		toppings.add("Bacon");
	}
}
