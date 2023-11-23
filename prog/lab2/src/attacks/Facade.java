package attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70.0, 100.0);
    }


    private boolean flag = false;

    @Override
    public void applyOppDamage(Pokemon pokemon, double damage){
        Status condition = pokemon.getCondition();
        if (condition.equals(Status.POISON) || condition.equals(Status.BURN) || condition.equals(Status.PARALYZE)) {
            pokemon.setMod(Stat.HP, -2 * (int) Math.round(damage));
            flag = true;
        }
    }

    @Override
    protected String describe(){
        return (flag == true) ? "использует Facade и наносит двойной урон" : "использует Facade";
    }

}
