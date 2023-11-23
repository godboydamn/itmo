package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0.0, 0.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect sleeping = new Effect().turns(2);
        pokemon.restore();
        pokemon.addEffect(sleeping);
    }

    @Override
    protected String describe(){
        return "использует Rest, засыпает на два хода и полностью исцеляется";
    }

}
