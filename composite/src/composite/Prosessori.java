
package composite;

public class Prosessori implements Laiteosa {
   
    private double hinta;
    
    public Prosessori(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        throw new RuntimeException("Prosessoriin ei voi lisätä osia.");
    }

    @Override
    public String toString() {
        return "Prosessori, hinta: " + this.hinta;
    }
    
}
