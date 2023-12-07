import interfaces.Scented;

public abstract class ScentedHygieneItem extends HygieneItem implements Scented {
    private String scent;

    public ScentedHygieneItem(String name, String owner){
        super(name, owner);
    }

    @Override
    public String getScent(){
        return scent;
    }

    @Override
    public void setScent(String scent)  {
        this.scent = scent;
    }

}
