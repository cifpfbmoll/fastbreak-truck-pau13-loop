package edu.pingpong.fastbreaktruck.domain.types;

import edu.pingpong.fastbreaktruck.domain.behaviour.Item;
import edu.pingpong.fastbreaktruck.domain.behaviour.Packing;
import edu.pingpong.fastbreaktruck.domain.components.Box;

public abstract class Cereals implements Item {

    public Cereals() {
    };

    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
