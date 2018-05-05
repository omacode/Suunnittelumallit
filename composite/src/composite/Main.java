
package composite;

public class Main {

    public static void main(String[] args) {
        
        Laiteosa prosessori = new Prosessori(1.0);
        Laiteosa verkkokortti = new Verkkokortti(10.0);
        Laiteosa naytonohjain = new Naytonohjain(10.0);
        Laiteosa muistipiiri = new Muistipiiri(10.0);
        
        Laiteosa emolevy = new Emolevy(10.0);
        emolevy.lisaaOsa(prosessori);
        emolevy.lisaaOsa(verkkokortti);
        emolevy.lisaaOsa(naytonohjain);
        emolevy.lisaaOsa(muistipiiri);
        
        Laiteosa kotelo = new Kotelo(3000.0);
        kotelo.lisaaOsa(emolevy);
        
        Laiteosa tietokone = new Tietokone();
        tietokone.lisaaOsa(kotelo);
        
        System.out.println("Tietokoneen hinta: " + tietokone.getHinta());
        System.out.println("");
        System.out.println(tietokone);

    }
    
}
