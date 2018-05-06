package state;

public class CharmanderHahmo {

    private KehitysTila tila;

    public CharmanderHahmo() {
        tila = Charmander.getInstance();
    }

    public void liiku() {
        tila.liiku();
    }

    public void syo() {
        tila.syo();
    }

    public void nuku() {
        tila.nuku();
    }

    protected void kehity() {
        tila.kehity(this);
    }

    protected void vaihdaTilaa(KehitysTila k) {
        tila = k;
    }

}
