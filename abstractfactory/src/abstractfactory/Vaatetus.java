package abstractfactory;

public class Vaatetus {

    private Farmarit farmarit;
    private Tpaita tpaita;
    private Lippis lippis;
    private Kengat kengat;    

    public Vaatetus(VaateTehdas vaateTehdas) {
        this.farmarit = vaateTehdas.luoFarmarit();
        this.tpaita = vaateTehdas.luoTPaita();
        this.lippis = vaateTehdas.luoLippis();
        this.kengat = vaateTehdas.luoKengat();        
    }

    public void vaihda(VaateTehdas vaateTehdas) {
        this.farmarit = vaateTehdas.luoFarmarit();
        this.tpaita = vaateTehdas.luoTPaita();
        this.lippis = vaateTehdas.luoLippis();
        this.kengat = vaateTehdas.luoKengat();  
    }

    @Override
    public String toString() {
        return "Vaatetus{" + "farmarit=" + farmarit + ", tpaita=" + tpaita + ", lippis=" + lippis + ", kengat=" + kengat + '}';
    }

}
