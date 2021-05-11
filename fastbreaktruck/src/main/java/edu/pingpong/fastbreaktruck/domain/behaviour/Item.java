package edu.pingpong.fastbreaktruck.domain.behaviour;

import java.util.Formatter;

public interface Item {

    public String name();

    public Packing packing();

    public Float pvp();

    // This method has been created with the help of @dfelta, first time ever formatting java outputs
    default String outputFormatter() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        formatter.format("Item: %1$s, Packing: %2$s, Price: %3$s", this.name(), this.packing().envelop(),
                this.pvp());

        formatter.close();

        return sb.toString();
    }
}
