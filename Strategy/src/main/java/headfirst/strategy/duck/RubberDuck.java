package headfirst.strategy.duck;

import headfirst.strategy.flybehavior.FlyNoWay;
import headfirst.strategy.quackbehavior.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
