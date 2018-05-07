package chainofresponsibility;

public abstract class PalkanKorotusKasittely {

    private PalkanKorotusKasittely seuraaja;

    public PalkanKorotusKasittely(PalkanKorotusKasittely seuraaja) {
        this.seuraaja = seuraaja;
    }

    public void kasittele(PalkanKorotusPyynto palkanKorotusPyynto) {
        if (this.seuraaja != null) {
            this.seuraaja.kasittele(palkanKorotusPyynto);
        }
    }

}
