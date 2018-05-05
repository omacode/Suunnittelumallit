
package composite;

public class Verkkokortti implements Laiteosa {
 
    private double hinta;
    
    public Verkkokortti(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        throw new RuntimeException("Verkkokorttiin ei voi lisätä osia.");
    }
    
    @Override
    public String toString() {
        return "Verkkokortti, hinta: " + this.hinta;
    }  
    
}
