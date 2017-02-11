package org.Factory_Simple.main;

import org.Factory_Simple.pizza.Pizza;
import org.Factory_Simple.pizzastore.PizzaStore;
import org.Factory_Simple.simplefactory.SimpleFactory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		PizzaStore pizzaStore = new PizzaStore(simpleFactory);
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName());
		System.out.println("=======================================");
		pizza = pizzaStore.orderPizza("clam");
		System.out.println("We ordered a " + pizza.getName());
	}
}
