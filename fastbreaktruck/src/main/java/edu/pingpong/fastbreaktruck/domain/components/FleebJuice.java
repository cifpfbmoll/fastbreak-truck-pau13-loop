package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.types.Drink;

public class FleebJuice extends Drink {

    private final String NAME = "Fleeb Juice";
    private final Float PVP = 35.0f;

    public FleebJuice() {
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
