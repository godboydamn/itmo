package attacks;

import ru.ifmo.se.pokemon.*;
public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75.0, 90.0);
    }

    private boolean flag = false;

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() < 0.3) {
            flag = true;
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return (flag == true) ? "использует Rock Slide и заставляет противника вздрогнуть" : "использует Rock Slide";
    }

}
