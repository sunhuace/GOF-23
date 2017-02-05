package headfirst.strategy.duck;

import headfirst.strategy.flybehavior.FlyNoWay;
import headfirst.strategy.quackbehavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
