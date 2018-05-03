package abstractfactory;

public class AdidasTehdas implements VaateTehdas {

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
