package edu.cpcc.labs;

public class PizzaDriver {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza(PizzaType.CHEESE_LOVERS);
		
		PizzaMaker maker = new PizzaMaker();
		
		Bakeable clayOven = new ClayOven();
		Bakeable electricOven = new ElectricOven();
		Bakeable brickOven = new BrickOven();
		
		maker.setBakeable(brickOven);
		maker.make(pizza);
		maker.setBakeable(clayOven);
		maker.make(pizza);
		maker.setBakeable(electricOven);
		maker.make(pizza);
	}

}
