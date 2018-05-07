package builder;

public class Waiter {

    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Object getBurger() {
        return burgerBuilder.getBurger();
    }

    public void constructBurger() {
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildSampyla();
        burgerBuilder.buildPihvi();
        burgerBuilder.buildJuusto();
        burgerBuilder.buildKastike();
    }
    
}
