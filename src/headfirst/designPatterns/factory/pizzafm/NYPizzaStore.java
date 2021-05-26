package headfirst.designpatterns.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            default -> null;
        };
    }
}
