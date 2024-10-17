package edu.cpcc.labs;

public class Pizza {
	
	private PizzaType pizzaType;
	
	public Pizza() {
		this.pizzaType = PizzaType.UNKNOWN;
 	}

	public Pizza(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}

	public PizzaType getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	
	
	

}
