package singleton;

public class AdidasTehdas implements VaateTehdas {

    public static final AdidasTehdas TEHDAS = new AdidasTehdas();

    private AdidasTehdas() {}

    public static AdidasTehdas getInstance() {
        return TEHDAS;
    }

    @Override
    public Farmarit luoFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public Tpaita luoTPaita() {
        return new AdidasTPaita();
    }

    @Override
    public Lippis luoLippis() {
        return new AdidasLippis();
    }

    @Override
    public Kengat luoKengat() {
        return new AdidasKengat();
    }

}
