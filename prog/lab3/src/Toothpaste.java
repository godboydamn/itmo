import interfaces.Scented;

public class Toothpaste extends HygieneItem implements Scented {
    private int fluorideLevel;
    private String scent;

    public Toothpaste(String name, String owner, int fluorideLevel, String scent) {
        super(name, owner);
        this.fluorideLevel = fluorideLevel;
        this.scent = scent;
    }

    public int getFluorideLevel() {
        return fluorideLevel;
    }

    public void setFluorideLevel(int fluorideLevel) {
        if (fluorideLevel >= 0) {
            this.fluorideLevel = fluorideLevel;
        } else {
            System.out.println("Уровень фторида должен быть положительным числом");
        }
    }

    @Override
    public String getScent() {
        return scent;
    }

    @Override
    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public String toString() {
        return "Toothpaste{" +
                "name='" + getName() + '\'' +
                ", owner='" + getOwner() + '\'' +
                ", fluorideLevel=" + fluorideLevel +
                ", scent='" + scent + '\'' +
                '}';
    }
}
