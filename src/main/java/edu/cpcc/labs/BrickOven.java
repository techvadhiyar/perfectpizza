package edu.cpcc.labs;

public class BrickOven implements Bakeable {

	@Override
	public void bake(Pizza pizza) {
		
		if (pizza.getPizzaType() == PizzaType.VEGGIE_LOVERS) {
			System.out.println(this.getClass().getName() + ":" + "I can bake a veggie pizza.");
		}
		else {
			System.out.printf(this.getClass().getName() + ":" + "I cannot bake this %s pizza.\n", pizza.getPizzaType().name());
		}
		
	}

}
