package attacks;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice(){
        super(Type.NORMAL, 0.0, 0.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe(){
        return "использует Play Nice и снижает атаку противника на 1";
    }

}
