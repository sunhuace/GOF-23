package headfirst.strategy;

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
