package attacks;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 60.0, 95.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe(){
        return "использует Rock Tomb и снижает скорость противника на 1";
    }

}
