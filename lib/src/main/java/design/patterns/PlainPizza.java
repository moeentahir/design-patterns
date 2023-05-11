package design.patterns;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getPrice() {
        return 4;
    }
}
