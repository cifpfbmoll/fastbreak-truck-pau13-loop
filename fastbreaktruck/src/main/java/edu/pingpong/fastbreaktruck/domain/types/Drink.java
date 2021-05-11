package edu.pingpong.fastbreaktruck.domain.types;

import edu.pingpong.fastbreaktruck.domain.behaviour.Item;
import edu.pingpong.fastbreaktruck.domain.behaviour.Packing;
import edu.pingpong.fastbreaktruck.domain.components.Bottle;

public abstract class Drink implements Item {

    public Drink() {
    };

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public String toString() {
        return packing().envelop();
    }
}
