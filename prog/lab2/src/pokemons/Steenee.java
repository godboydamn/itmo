package pokemons;

import attacks.PlayNice;

public class Steenee extends Bounsweet{
    public Steenee(String name, int level){
        super(name, level);
        this.setStats(52.0, 40.0, 48.0, 40.0, 48.0, 62.0);
        this.addMove(new PlayNice());
    }
}
