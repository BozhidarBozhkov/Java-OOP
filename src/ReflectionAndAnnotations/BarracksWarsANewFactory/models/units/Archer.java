package ReflectionAndAnnotations.BarracksWarsANewFactory.models.units;

import ReflectionAndAnnotations.P05barrackWars.barracksWars.models.units.AbstractUnit;

public class Archer extends AbstractUnit {
    private static final int ARCHER_HEALTH = 25;
    private static final int ARCHER_DAMAGE = 7;

    public Archer() {
        super(ARCHER_HEALTH, ARCHER_DAMAGE);
    }
}

class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    protected Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}

class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    protected Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
