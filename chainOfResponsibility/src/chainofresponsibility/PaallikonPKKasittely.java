package chainofresponsibility;

public class PaallikonPKKasittely extends PalkanKorotusKasittely {

    private final double MAXKOROTUSPROSENTTI = 5;

    public PaallikonPKKasittely(PalkanKorotusKasittely seuraaja) {
        super(seuraaja);
    }

    @Override
    public void kasittele(PalkanKorotusPyynto korotusPyynto) {
        if (korotusPyynto.getProsentti() < MAXKOROTUSPROSENTTI) {
            System.out.println("Päällikkö käsittelee palkankorotustoiveesi: " + korotusPyynto.getProsentti());
        } else {
            super.kasittele(korotusPyynto);
        }
    }

}
