import interfaces.*;

public abstract class HygieneItem implements Owner, Scented {
    private String name;
    private String owner;

    public HygieneItem(String name, String owner){
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String owner){
        this.owner = owner;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass()!= object.getClass() ){
            return false;
        }

        HygieneItem item = (HygieneItem) object;
        return name.equals(item.name) && owner.equals(item.owner);
    }

    @Override
    public int hashCode(){
        int result = name.hashCode();
        result = 31 * result + owner.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "HygieneItem{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

}
