
package composite;

public class Muistipiiri implements Laiteosa {

    private double hinta;
    
    public Muistipiiri(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        throw new RuntimeException("Muistipiiriin ei voi lisätä osia.");
    }
    
    @Override
    public String toString() {
        return "Muistipiiri, hinta: " + this.hinta;
    }
}
