package design.patterns;

public abstract class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }
}
