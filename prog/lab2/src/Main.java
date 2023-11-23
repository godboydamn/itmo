import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main{
    public static void main(String[] args){
        Battle b = new Battle();

        Pokemon p1 = new Bounsweet("", 1);
        Pokemon p2 = new Cranidos("", 1);
        Pokemon p3 = new Rampardos("", 1);
        Pokemon p4 = new Solrock("", 1);
        Pokemon p5 = new Steenee("", 1);
        Pokemon p6 = new Tsareena("", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}