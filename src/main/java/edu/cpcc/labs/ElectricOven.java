package edu.cpcc.labs;

public class ElectricOven implements Bakeable {

	@Override
	public void bake(Pizza pizza) {
		if (pizza.getPizzaType() == PizzaType.CHEESE_LOVERS) {
			System.out.println(this.getClass().getName() + ":" + "I can bake a cheese lover pizza.");
		}
		else {
			System.out.printf(this.getClass().getName() + ":" + "I cannot bake this %s pizza.\n", pizza.getPizzaType().name());
		}
		
	}

}
