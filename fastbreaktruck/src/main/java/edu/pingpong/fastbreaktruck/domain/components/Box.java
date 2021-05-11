package edu.pingpong.fastbreaktruck.domain.components;

import edu.pingpong.fastbreaktruck.domain.behaviour.Packing;

public class Box implements Packing {

    public Box() {
    };

    @Override
    public String envelop() {
        return "Box";
    }
}
