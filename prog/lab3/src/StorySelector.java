import interfaces.StoryTellerable;
import java.util.Scanner;
import ScentTypes.ScentTypes;

public class StorySelector {
    public static void main(String[] args) {
        selectStory();
    }

    public static void selectStory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите персонажа для истории:");
        System.out.println("1. Крабс");
        System.out.println("2. Скуперфилд");

        int choice = scanner.nextInt();
        StoryTellerable storyTeller = null;

        switch (choice) {
            case 1:
                HygieneItem myPowder = new Powder("My Powder", "Crabs", ScentTypes.LEMON, 42);
                HygieneItem skuperfildPowder = new Powder("Skuperfild's Powder", "Skuperfild", ScentTypes.MINT, 27);
                Crabs crabs = new Crabs("Crabs");
                storyTeller = new CrabsStoryTeller(myPowder, skuperfildPowder, crabs);
                break;
            case 2:
                HygieneItem mySoap = new Soap("My Soap", "Crab's Soap", ScentTypes.STRAWBERRY, "My Unique Field");
                HygieneItem crabSoap = new Soap("Crab's Soap", "Skuperfild", ScentTypes.LEMON, "Crab's Unique Field");
                Skuperfild skuperfild = new Skuperfild("Skuperfild");
                storyTeller = new SkuperfildStoryTeller(new Wash(), mySoap, crabSoap, skuperfild);
                break;
            default:
                System.out.println("Неверный выбор!");
                break;
        }

        if (storyTeller != null) {
            storyTeller.tellStory();
        }

        scanner.close();
    }
}
