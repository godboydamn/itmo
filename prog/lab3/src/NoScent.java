import interfaces.Scented;

public class NoScent implements Scented {
    @Override
    public String getScent() {
        return "";
    }

    @Override
    public void setScent(String scent) {
    }
}
