package attacks;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove{
    public TakeDown(){
        super(Type.NORMAL, 90.0, 85.0);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)(damage*0.25));
    }

    @Override
    protected String describe(){
        return "использует Take Down и наносит себе 25% нанесенного противнику урона";
    }

}
