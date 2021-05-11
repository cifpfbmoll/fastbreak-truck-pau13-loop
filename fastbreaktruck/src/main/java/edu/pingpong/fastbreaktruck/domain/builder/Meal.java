package edu.pingpong.fastbreaktruck.domain.builder;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.fastbreaktruck.domain.behaviour.Item;

public class Meal {

    private Float total = 0f;
    private List<Item> items = new ArrayList<>();

    public Meal() {
    };

    public List<Item> getItems() {
        return this.items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void showItems() {
        getItems().stream().forEach(i -> System.out.println(i));
    }

    public Float getTotalPrice() {
        setTotalPrice();
        return this.total;
    }

    public void setTotalPrice() {
        this.total = 0f;
        getItems().stream().forEach(i -> this.total += i.pvp());
    }
}
