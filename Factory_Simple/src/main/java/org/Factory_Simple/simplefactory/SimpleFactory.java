package org.Factory_Simple.simplefactory;

import org.Factory_Simple.pizza.CheesePizza;
import org.Factory_Simple.pizza.ClamPizza;
import org.Factory_Simple.pizza.Pizza;
/**
 * 简单工厂的实现
 */
public class SimpleFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza();
		}
		return pizza;
	}
}
