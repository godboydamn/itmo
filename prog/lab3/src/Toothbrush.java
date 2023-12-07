import interfaces.Electric;

public class Toothbrush extends HygieneItem implements Electric {
    private boolean electric;

    private final NoScent noScent = new NoScent();

    public Toothbrush(String name, String owner, boolean electric) {
        super(name, owner);
        this.electric = electric;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    public String getScent() {
        return noScent.getScent();
    }

    public void setScent(String scent) {
        noScent.setScent(scent);
    }

    @Override
    public String toString() {
        return "Toothbrush{" +
                "name='" + getName() + '\'' +
                ", owner='" + getOwner() + '\'' +
                ", electric=" + electric +
                '}';
    }
}
