public class Main {
    public static void main(String[] args) {
        Soap skuperfieldSoap = new Soap("StrawberrySoap", "Skuperfield", ScentTypes.STRAWBERRY);
        Soap krabsSoap = new Soap("StrawberrySoap", "Krabs", ScentTypes.STRAWBERRY);

        System.out.println("Skuperfield положил свое мыло рядом с мылом, принадлежащим Крабсу");

        System.out.println("Skuperfield начал использовать мыло, которое лежало рядом (мыло, принадлежащее Крабсу): " + skuperfieldSoap.getScent());
        System.out.println("Мыло Крабса имеет аромат: " + krabsSoap.getScent());

        Toothpaste skuperfieldToothpaste = new Toothpaste("MintyFresh", "Skuperfield", 7, "Mint");
        Toothpaste krabsToothpaste = new Toothpaste("MintyFresh", "Krabs", 5, "Mint");

        Toothbrush krabsToothbrush = new Toothbrush("ElectricBrush", "Krabs", true);
        System.out.println("Skuperfield использовал зубную щетку, принадлежащую Крабсу (электрическая): " + (krabsToothbrush.isElectric() ? "Да" : "Нет"));

        skuperfieldToothpaste.setOwner("Krabs");
        System.out.println("Skuperfield пытался определить аромат своей зубной пасты и зубной пасты Крабса:\n" +
                "Своя зубная паста: Уровень фторида - " + skuperfieldToothpaste.getFluorideLevel() +
                "\nЗубная паста Крабса: Уровень фторида - " + krabsToothpaste.getFluorideLevel());

        System.out.println("Эксперименты завершились тем, что Skuperfield чихнул в порошок, " +
                "и весь порошок взвился кверху на манер облака");
    }
}
