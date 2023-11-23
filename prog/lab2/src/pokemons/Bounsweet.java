package pokemons;

import attacks.Rest;
import attacks.Splash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level){
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(42.0, 30.0, 38.0, 30.0, 38.0, 32.0);
        this.setMove(new Splash(), new Rest());
    }
}
