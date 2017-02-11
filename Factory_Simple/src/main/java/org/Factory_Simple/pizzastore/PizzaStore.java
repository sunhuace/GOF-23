package org.Factory_Simple.pizzastore;

import org.Factory_Simple.pizza.Pizza;
import org.Factory_Simple.simplefactory.SimpleFactory;

public class PizzaStore {
	private SimpleFactory simpleFactory;

	public PizzaStore(SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = simpleFactory.createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
