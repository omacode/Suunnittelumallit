package decorator;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<String, Pizza> pizzas;

    public Menu() {
        this.pizzas = new HashMap<>();
    }

    public void add(String name, Pizza pizza) {
        this.pizzas.put(name, pizza);
    }

    public void printMenu() {
        System.out.println("Menu:");
        this.pizzas.entrySet().stream().forEach(e -> {
            String name = e.getKey();
            Pizza pizza = e.getValue();
            System.out.println(name + " / " + pizza.getDescription() + " / " + pizza.getPrice() + "€");
        });
    }
}
