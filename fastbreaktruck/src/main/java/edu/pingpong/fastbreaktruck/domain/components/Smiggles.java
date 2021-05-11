package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.types.Cereals;

public class Smiggles extends Cereals {

    private final String NAME = "Smiggles";
    private final Float PVP = 50.0f;

    public Smiggles() {
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
