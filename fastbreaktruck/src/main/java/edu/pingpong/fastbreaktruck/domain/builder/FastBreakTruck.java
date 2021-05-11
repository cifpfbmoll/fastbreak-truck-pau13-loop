package edu.pingpong.fastbreaktruck.domain.builder;

import edu.pingpong.fastbreaktruck.domain.components.Eyeholes;
import edu.pingpong.fastbreaktruck.domain.components.FleebJuice;
import edu.pingpong.fastbreaktruck.domain.components.Plumbus;
import edu.pingpong.fastbreaktruck.domain.components.Smiggles;
import edu.pingpong.fastbreaktruck.domain.components.TurbulentJuice;

public class FastBreakTruck {

    public FastBreakTruck() {
    };

    public static Meal prepareEyeholes() {

        Meal meal = new Meal();

        meal.add(new Eyeholes());
        meal.add(new TurbulentJuice());

        return meal;
    }

    public static Meal prepareSmiggles() {

        Meal meal = new Meal();

        meal.add(new Smiggles());
        meal.add(new FleebJuice());

        return meal;
    }

    public static void addToy(Meal meal) {
        meal.add(new Plumbus());
    }
}
