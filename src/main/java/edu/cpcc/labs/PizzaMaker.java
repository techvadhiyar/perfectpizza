package edu.cpcc.labs;

public class PizzaMaker {
	
	private Bakeable bakeable;
	
	
	public PizzaMaker() {
		super();
	}

	public PizzaMaker(Bakeable bakeable) {
		super();
		this.bakeable = bakeable;
	}
	
	
	public Bakeable getBakeable() {
		return bakeable;
	}

	public void setBakeable(Bakeable bakeable) {
		this.bakeable = bakeable;
	}

	
	// make pizza 
	public void make(final Pizza pizza) {
		bakeable.bake(pizza);
	}

}
