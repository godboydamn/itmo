import interfaces.Scented;


public class Soap extends HygieneItem implements Scented {
    private ScentTypes scent;

    public Soap(String name, String owner, ScentTypes scent){
        super(name, owner);
        this.scent = scent;
    }

    @Override
    public String getScent() {
        return scent.name().toLowerCase();
    }

    @Override
    public void setScent(String scent) {
        try {
            this.scent = ScentTypes.valueOf(scent.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Указанный аромат отсутствует");
        }
    }

    @Override
    public String toString(){
        return "Soap{" +
                "name='" + getName() + '\'' +
                ", owner='" + getOwner() + '\'' +
                ", scent='" + scent + '\'' +
                '}';
    }

}
