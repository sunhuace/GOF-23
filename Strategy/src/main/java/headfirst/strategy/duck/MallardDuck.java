package headfirst.strategy.duck;

import headfirst.strategy.flybehavior.FlyWithWings;
import headfirst.strategy.quackbehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}