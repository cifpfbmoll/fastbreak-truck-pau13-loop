package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.types.Drink;

public class TurbulentJuice extends Drink {

    private final String NAME = "Turbulent Juice";
    private final Float PVP = 30.0f;

    public TurbulentJuice() {
    };

    @Override
    public String name() {
        return this.NAME;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
