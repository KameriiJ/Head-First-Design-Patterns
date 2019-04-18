package headfirst.designpatterns.factory.pizzas;

public class SimplePizzaFactory{
	
	private static SimplePizzaFactory factoryInstance;
	
	public static SimplePizzaFactory getInstance()
	{
	   if(factoryInstance == null){
	      factoryInstance = new SimplePizzaFactory();
	   }
	return factoryInstance;
	}

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		} else if (type.equals("hawaiian")) {
			pizza = new Hawaiianpizza();
		}
		return pizza;
	}
}
