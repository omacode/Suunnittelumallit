package singleton;

public class BossTehdas implements VaateTehdas {

    public static final BossTehdas TEHDAS = new BossTehdas();

    private BossTehdas() {}

    public static BossTehdas getInstance() {
        return TEHDAS;
    }

    @Override
    public Farmarit luoFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public Tpaita luoTPaita() {
        return new BossTPaita();
    }

    @Override
    public Lippis luoLippis() {
        return new BossLippis();
    }

    @Override
    public Kengat luoKengat() {
        return new BossKengat();
    }

}
