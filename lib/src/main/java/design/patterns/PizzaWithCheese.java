package design.patterns;

public class PizzaWithCheese extends PizzaDecorator {

    public PizzaWithCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }
}
