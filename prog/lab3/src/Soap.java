import ScentTypes.ScentTypes;

public class Soap extends HygieneItem {
    private String uniqueField;

    public Soap(String name, String owner, ScentTypes scentType, String uniqueField) {
        super(name, owner, scentType);
        this.uniqueField = uniqueField;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (uniqueField != null ? uniqueField.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Soap)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Soap soap = (Soap) object;
        return uniqueField != null ? uniqueField.equals(soap.uniqueField) : soap.uniqueField == null;
    }

    @Override
    public String toString() {
        return "Soap{" + "uniqueField='" + uniqueField + '\'' + "} " + super.toString();
    }
}
