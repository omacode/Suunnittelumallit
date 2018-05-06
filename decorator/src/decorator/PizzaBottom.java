package decorator;

public class PizzaBottom implements Pizza {

    private double price;

    public PizzaBottom() {
        this.price = 5.0;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return "bottom tomato sauce cheese";
    }

}
