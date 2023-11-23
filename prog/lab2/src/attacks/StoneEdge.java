package attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK, 100.0, 80.0);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 3.0;
    }

    @Override
    protected String describe(){
        return "использует Stone Edge";
    }

}
