
package composite;

public class Naytonohjain implements Laiteosa {
 
    private double hinta;
    
    public Naytonohjain(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        throw new RuntimeException("Näytönohjaimeen ei voi lisätä osia.");
    }
    
    @Override
    public String toString() {
        return "Näytönohjain, hinta: " + this.hinta;
    }
}
