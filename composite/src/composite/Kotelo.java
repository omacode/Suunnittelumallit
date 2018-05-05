
package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

    private double hinta;
    private List<Laiteosa> osat;

    public Kotelo(double hinta) {
        this.hinta = hinta;
        this.osat = new ArrayList<>();
    }

    @Override
    public double getHinta() {
        return this.hinta + this.osat.stream().mapToDouble(o -> o.getHinta()).sum();
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        this.osat.add(osa);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Kotelo, hinta: " + this.hinta + " (lisäosien hinta: " + (this.getHinta() - this.hinta) + ")");
        this.osat.stream().forEach(o -> sb.append("\n  " + o));
        
        return sb.toString();
    }
    
}
