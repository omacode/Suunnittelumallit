package state;

public class Charmeleon extends KehitysTila {

    public static final Charmeleon CHARMELEON = new Charmeleon();

    private Charmeleon() {
    }

    public static Charmeleon getInstance() {
        return CHARMELEON;
    }

    @Override
    public void liiku() {
        System.out.println("Charmeleon liikkuu");
    }

    @Override
    public void syo() {
        System.out.println("Charmeleon syo");
    }

    @Override
    public void nuku() {
        System.out.println("Charmeleon nukkuu");
    }

    @Override
    public void kehity(CharmanderHahmo c) {
        vaihdaTilaa(c, Charizard.getInstance());
    }

}
