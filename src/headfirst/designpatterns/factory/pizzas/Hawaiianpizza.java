package headfirst.designpatterns.factory.pizzas;

public class Hawaiianpizza extends Pizza {
	public Hawaiianpizza() {
		name = "Hawaiian pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Pie apple");
		toppings.add("Ham");
		toppings.add("Bacon");
	}
}
