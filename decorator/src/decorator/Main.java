package decorator;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        Pizza tropicana = new Pineapple(new Ham(new PizzaBottom()));
        Pizza margherita = new Cheese(new PizzaBottom());
        Pizza specialOpera = new Salami(new Tuna(new Ham(new PizzaBottom())));

        menu.add("Tropicana", tropicana);
        menu.add("Margherita", margherita);
        menu.add("Special Opera", specialOpera);

        menu.printMenu();
    }

}
