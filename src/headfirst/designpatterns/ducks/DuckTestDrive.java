package headfirst.designpatterns.ducks;

public class DuckTestDrive {

    public static void main(String[] args) {
        // write your code here
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
