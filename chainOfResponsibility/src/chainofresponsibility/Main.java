package chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        ToimitusjohtajaPKKasittely toimitusjohtaja = new ToimitusjohtajaPKKasittely();
        PaallikonPKKasittely paallikko = new PaallikonPKKasittely(toimitusjohtaja);
        LahiesimiesPKKasittely lahiesimies = new LahiesimiesPKKasittely(paallikko);

        lahiesimies.kasittele(new PalkanKorotusPyynto(1.9));
        System.out.println("-----");
        lahiesimies.kasittele(new PalkanKorotusPyynto(2.1));
        System.out.println("-----");
        lahiesimies.kasittele(new PalkanKorotusPyynto(5));
    }

}
