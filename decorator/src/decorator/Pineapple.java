package decorator;

public class Pineapple extends PizzaDecorator {

    private double price;

    public Pineapple(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 1.5;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Pineapple";
    }

}
