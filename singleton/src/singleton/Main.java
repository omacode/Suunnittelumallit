package singleton;

public class Main {

    public static void main(String[] args) {
        VaateTehdas adidasTehdas = AdidasTehdas.getInstance();
        Vaatetus jasperinVaatetus = new Vaatetus(adidasTehdas);

        System.out.println("Jasperin vaatteet:");
        System.out.println(jasperinVaatetus);

        System.out.println("");

        VaateTehdas bossTehdas = BossTehdas.getInstance();
        jasperinVaatetus.vaihda(bossTehdas);

        System.out.println("Jasperin vaatteet vaihdon jälkeen:");
        System.out.println(jasperinVaatetus);
    }

}
