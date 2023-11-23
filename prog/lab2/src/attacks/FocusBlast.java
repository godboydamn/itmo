package attacks;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120.0, 70.0);
    }

    private boolean flag = false;

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() < 0.1){
            flag = true;
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe(){
        return (flag == true) ? "использует Focus Blast и снижает специальную броню противника на 1" : "использует Focus Blast";
    }

}
