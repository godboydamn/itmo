package pokemons;

import attacks.Confide;

public class Tsareena extends Steenee{
    public Tsareena(String name, int level){
        super(name, level);
        this.addMove(new Confide());
        this.setStats(72.0, 120.0, 98.0, 50.0, 98.0, 72.0);
    }
}
