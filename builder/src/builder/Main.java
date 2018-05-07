package builder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        BurgerBuilder mcDonalds = new McDonaldsBuilder();
        BurgerBuilder hesburger = new HesburgerBuilder();

        waiter.setBurgerBuilder(hesburger);
        waiter.constructBurger();
        List<Object> hBurger = (ArrayList) waiter.getBurger();

        System.out.println("Hesburger Burger:");
        hBurger.forEach(p -> System.out.println(p));

        System.out.println("");

        waiter.setBurgerBuilder(mcDonalds);
        waiter.constructBurger();
        StringBuilder mcBurger = (StringBuilder) waiter.getBurger();

        System.out.println("McDonalds Burger:");
        System.out.println(mcBurger.toString());
    }

}
