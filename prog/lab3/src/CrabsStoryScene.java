
public class CrabsStoryScene {
    private String location;
    private String situation;

    public CrabsStoryScene(String location, String situation) {
        this.location = location;
        this.situation = situation;
    }

    public void describeScene() {
        System.out.println("Текущая сцена: " + location);
        System.out.println("Ситуация: " + situation);
    }

    @Override
    public int hashCode() {
        int result = location != null ? location.hashCode() : 0;
        result = 31 * result + (situation != null ? situation.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CrabsStoryScene)) {
            return false;
        }
        CrabsStoryScene that = (CrabsStoryScene) object;
        return (location != null ? location.equals(that.location) : that.location == null) &&
                (situation != null ? situation.equals(that.situation) : that.situation == null);
    }

    @Override
    public String toString() {
        return "CrabsStoryScene{" +
                "location='" + location + '\'' +
                ", situation='" + situation + '\'' +
                '}';
    }
}
