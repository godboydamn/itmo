import ScentTypes.ScentTypes;
public class Powder extends HygieneItem {
    private int uniqueField;

    public Powder(String name, String owner, ScentTypes scentType, int uniqueField) {
        super(name, owner, scentType);
        this.uniqueField = uniqueField;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + uniqueField;
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Powder)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Powder powder = (Powder) object;
        return uniqueField == powder.uniqueField;
    }

    @Override
    public String toString() {
        return "Powder{" +
                "uniqueField=" + uniqueField +
                "} " + super.toString();
    }
}
