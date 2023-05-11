package design.patterns;

public class PizzaWithTomato extends PizzaDecorator {
    public PizzaWithTomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with tomato";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }
}
