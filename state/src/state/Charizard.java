package state;

public class Charizard extends KehitysTila {

    public static final Charizard CHARIZARD = new Charizard();

    private Charizard() {
    }

    public static Charizard getInstance() {
        return CHARIZARD;
    }

    @Override
    public void liiku() {
        System.out.println("Charizard liikkuu");
    }

    @Override
    public void syo() {
        System.out.println("Charizard syo");
    }

    @Override
    public void nuku() {
        System.out.println("Charizard nukkuu");
    }

    @Override
    public void kehity(CharmanderHahmo c) {
    }

}
