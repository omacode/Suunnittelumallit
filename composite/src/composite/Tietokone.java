
package composite;

import java.util.ArrayList;
import java.util.List;

public class Tietokone implements Laiteosa {

    private List<Laiteosa> osat;

    public Tietokone() {
        this.osat = new ArrayList<>();
    }

    @Override
    public double getHinta() {
        return this.osat.stream().mapToDouble(o -> o.getHinta()).sum();
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        this.osat.add(osa);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tietokone, hinta: " + this.getHinta());
        this.osat.stream().forEach(o -> sb.append("\n  " + o));
        
        return sb.toString();
    }
}
