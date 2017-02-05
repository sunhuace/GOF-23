package headfirst.strategy.main;

import headfirst.strategy.duck.DecoyDuck;
import headfirst.strategy.duck.MallardDuck;
import headfirst.strategy.duck.ModelDuck;
import headfirst.strategy.duck.RubberDuck;
import headfirst.strategy.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
		ModelDuck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
