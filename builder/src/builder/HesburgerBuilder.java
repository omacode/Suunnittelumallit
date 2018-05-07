package builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder extends BurgerBuilder {

    private List<String> parts;

    @Override
    public Object getBurger() {
        return parts;
    }

    @Override
    public void createNewBurgerProduct() {
        parts = new ArrayList<>();
    }

    @Override
    public void buildSampyla() {
        parts.add("Sampylä");
    }

    @Override
    public void buildPihvi() {
        parts.add("Naudanlihapihvi");
    }

    @Override
    public void buildJuusto() {
        parts.add("Juusto");
    }

    @Override
    public void buildKastike() {
        parts.add("Ketsuppi");
    }

}
