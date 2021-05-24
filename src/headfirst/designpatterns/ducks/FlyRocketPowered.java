package headfirst.designpatterns.ducks;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a Rocket!");
    }
}
