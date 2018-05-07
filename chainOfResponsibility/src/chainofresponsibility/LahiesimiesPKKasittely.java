package chainofresponsibility;

public class LahiesimiesPKKasittely extends PalkanKorotusKasittely {

    private final double MAXKOROTUSPROSENTTI = 2;

    public LahiesimiesPKKasittely(PalkanKorotusKasittely seuraaja) {
        super(seuraaja);
    }

    @Override
    public void kasittele(PalkanKorotusPyynto korotusPyynto) {
        if (korotusPyynto.getProsentti() <= MAXKOROTUSPROSENTTI) {
            System.out.println("Lähiesimies käsittelee palkankorotustoiveesi: " + korotusPyynto.getProsentti());
        } else {
            super.kasittele(korotusPyynto);
        }
    }

}
