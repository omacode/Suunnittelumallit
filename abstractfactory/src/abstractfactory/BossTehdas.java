package abstractfactory;

public class BossTehdas implements VaateTehdas {

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
