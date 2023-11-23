package attacks;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100.0, 100.0);
    }

    private boolean flag = false;

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        Status Status = def.getCondition();
        if (Status.equals(Status.SLEEP)){
            flag = true;
            return true;}
        else
            return false;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        if (flag == true){
            double currentHP = pokemon.getHP();
            double firstHP = pokemon.getStat(Stat.HP);
            double diffHP = (firstHP - currentHP)*0.5;
            pokemon.setMod(Stat.HP, (int)-diffHP);
        }
    }

    @Override
    protected String describe(){
        return (flag == true) ? "использует Dream Eater и восстанавливает 50% потраченного здоровья" : "Dream Eater промахивается";
    }

}
