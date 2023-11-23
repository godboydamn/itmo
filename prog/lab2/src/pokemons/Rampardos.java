package pokemons;

import attacks.FocusBlast;

public class Rampardos extends  Cranidos{
    public Rampardos(String name, int level){
        super(name, level);
        this.addMove(new FocusBlast());
        this.setStats(97.0, 165.0, 60.0, 65.0, 50.0, 58.0);
    }
}
