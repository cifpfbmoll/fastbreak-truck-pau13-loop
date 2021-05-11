package edu.pingpong.fastbreaktruck.domain.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.fastbreaktruck.domain.components.Eyeholes;
import edu.pingpong.fastbreaktruck.domain.components.Plumbus;
import edu.pingpong.fastbreaktruck.domain.components.TurbulentJuice;

public class MealTest {

    private Meal meal;
    private Eyeholes eyeholes;
    
    @Before
    public void setUpMeal() {
        
        meal = new Meal();
        eyeholes = new Eyeholes();
    }

    @Test
    public void getItemsTest() {

        meal.add(eyeholes);
        meal.add(new TurbulentJuice());
        meal.add(new Plumbus());

        // Check size list 
        assertEquals(3, meal.getItems().size());

        // Check eyeholes has been added correctly to the list
        assertTrue(meal.getItems().get(0).equals(eyeholes));

        // Check correct total price 
        assertEquals(155.0, meal.getTotalPrice(), 0.01);
    }
}
