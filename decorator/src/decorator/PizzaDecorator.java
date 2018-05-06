package decorator;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizzaToBeDecorated;

    public PizzaDecorator(Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }

    @Override
    public double getPrice() {
        return pizzaToBeDecorated.getPrice();
    }

    @Override
    public String getDescription() {
        return pizzaToBeDecorated.getDescription();
    }

}
