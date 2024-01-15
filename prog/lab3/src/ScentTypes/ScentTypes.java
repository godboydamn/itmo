package ScentTypes;

public enum ScentTypes {
    STRAWBERRY("земляничного"),
    MINT("мятного"),
    LEMON("лимонного");

    private final String russianName;

    ScentTypes(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
