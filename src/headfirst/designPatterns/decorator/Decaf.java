package headfirst.designpatterns.decorator;

public class Decaf extends Beverage {
    private Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
