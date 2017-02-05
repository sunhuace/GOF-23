package headfirst.strategy.duck;

import headfirst.strategy.flybehavior.FlyNoWay;
import headfirst.strategy.quackbehavior.MuteQuack;

/**
 * 测试提交代码的过程
 * @author sun
 *
 */
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}