public enum ScentTypes {
    STRAWBERRY("клубника"),
    MINT("мята"),
    LEMON("лимон");

    private final String russianName;
    ScentTypes(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName(){
        return russianName;
    }

}
