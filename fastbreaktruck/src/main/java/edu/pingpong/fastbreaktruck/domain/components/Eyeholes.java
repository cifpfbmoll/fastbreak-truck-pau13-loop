package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.types.Cereals;

public class Eyeholes extends Cereals {

    private final String NAME = "Eyeholes";
    private final Float PVP = 25.0f;

    public Eyeholes() {
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
