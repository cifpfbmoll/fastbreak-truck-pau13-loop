package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.behaviour.Packing;

public class Bottle implements Packing {

    public Bottle() {
    };

    @Override
    public String envelop() {
        return "Bottle";
    }
}
