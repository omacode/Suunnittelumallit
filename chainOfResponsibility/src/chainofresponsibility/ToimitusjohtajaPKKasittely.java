package chainofresponsibility;

public class ToimitusjohtajaPKKasittely extends PalkanKorotusKasittely {

    public ToimitusjohtajaPKKasittely() {
        super(null);
    }

    @Override
    public void kasittele(PalkanKorotusPyynto korotusPyynto) {
        System.out.println("Toimitusjohtaja käsittelee palkankorotustoiveesi: " + korotusPyynto.getProsentti());
    }

}
