package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.types.Toy;

public class Plumbus extends Toy{
    
    private final String NAME = "Plumbus";
    private final Float PVP = 100.0f;

    public Plumbus() {
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
