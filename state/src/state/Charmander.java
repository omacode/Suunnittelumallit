package state;

public class Charmander extends KehitysTila {

    public static final Charmander CHARMANDER = new Charmander();

    private Charmander() {
    }

    public static Charmander getInstance() {
        return CHARMANDER;
    }

    @Override
    public void liiku() {
        System.out.println("Charmander liikkuu");
    }

    @Override
    public void syo() {
        System.out.println("Charmander syo");
    }

    @Override
    public void nuku() {
        System.out.println("Charmander nukkuu");
    }

    @Override
    public void kehity(CharmanderHahmo c) {
        vaihdaTilaa(c, Charmeleon.getInstance());
    }

}
