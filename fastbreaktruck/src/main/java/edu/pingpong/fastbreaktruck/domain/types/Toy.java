package edu.pingpong.fastbreaktruck.domain.types;

import edu.pingpong.fastbreaktruck.domain.behaviour.Item;
import edu.pingpong.fastbreaktruck.domain.behaviour.Packing;
import edu.pingpong.fastbreaktruck.domain.components.Box;

public class Toy implements Item{
    
    public Toy() {
    };

    @Override
    public Packing packing() {
        return new Box();
    }

    public String toString() {
        return this.outputFormatter();
    }
}
