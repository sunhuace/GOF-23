package headfirst.strategy.main;

import headfirst.strategy.duck.Duck;
import headfirst.strategy.duck.MallardDuck;
import headfirst.strategy.duck.ModelDuck;
import headfirst.strategy.flybehavior.FlyRocketPowered;
import headfirst.strategy.quackbehavior.MuteQuack;

public class MiniDuckSimulator1 {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Duck model = new ModelDuck();
		
		model.performQuack();
		model.setQuackBehavior(new MuteQuack());
		model.performQuack();
		
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
