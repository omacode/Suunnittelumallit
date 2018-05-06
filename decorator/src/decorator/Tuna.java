package decorator;

public class Tuna extends PizzaDecorator {

    private double price;

    public Tuna(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 2.0;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Tuna";
    }

}
