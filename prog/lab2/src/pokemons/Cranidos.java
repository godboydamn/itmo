package pokemons;

import attacks.RockSlide;
import attacks.RockTomb;
import attacks.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cranidos extends Pokemon {
    public Cranidos(String name, int level){
        super(name, level);
        this.setStats(67.0, 125.0, 40.0, 30.0, 30.0, 58.0);
        this.setType(Type.ROCK);
        this.setMove(new TakeDown(), new RockTomb(), new RockSlide());
    }
}
