package builder;

public class McDonaldsBuilder extends BurgerBuilder {

    private StringBuilder parts;

    @Override
    public Object getBurger() {
        return parts;
    }

    @Override
    public void createNewBurgerProduct() {
        parts = new StringBuilder();
    }

    @Override
    public void buildSampyla() {
        parts.append("Sampylä").append("\n");
    }

    @Override
    public void buildPihvi() {
        parts.append("Kanapihvi").append("\n");
    }

    @Override
    public void buildJuusto() {
        parts.append("Juusto").append("\n");
    }

    @Override
    public void buildKastike() {
        parts.append("Kurkkumajoneesi").append("\n");
    }

}
