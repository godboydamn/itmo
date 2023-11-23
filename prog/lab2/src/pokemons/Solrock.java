package pokemons;

import attacks.DreamEater;
import attacks.Facade;
import attacks.Psychic;
import attacks.StoneEdge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Solrock extends Pokemon {
    public Solrock(String name, int level){
        super(name, level);
        this.setStats(90.0, 95.0, 85.0, 55.0, 65.0, 75.0);
        this.setType(Type.ROCK, Type.PSYCHIC);
        this.setMove(new Psychic(), new Facade(), new DreamEater(), new StoneEdge());
    }
}
