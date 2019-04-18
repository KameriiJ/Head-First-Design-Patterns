package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleHawaiianPizza extends Pizza{

	public ChicagoStyleHawaiianPizza() {
		name = "Chicago Style Hawaiian Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Fresh Mozzarella");
		toppings.add("Pie apple");
		toppings.add("Ham");
		toppings.add("Bacon");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
