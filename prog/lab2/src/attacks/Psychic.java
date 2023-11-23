package attacks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC, 90.0, 100.0);
    }

    private boolean flag = false;
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random()<0.1) flag = true;
        if (flag == true) pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe(){
        return (flag == true) ? "использует Psychic и снижает специальную броню противника на 1" : "использует Psychic";
    }

}
