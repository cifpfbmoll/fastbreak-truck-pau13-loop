package edu.pingpong.fastbreaktruck.domain.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.fastbreaktruck.domain.components.Bottle;
import edu.pingpong.fastbreaktruck.domain.components.Box;

public class ComponentsTest {

    // Packing
    private Box box;
    private Bottle bottle;

    // Items
    // Just testing one of each beacuse all of them implement the same methods
    private Smiggles smiggles;
    private FleebJuice fleebJuice;

    @Before
    public void setupTypes() {
        // Packing
        box = new Box();
        bottle = new Bottle();

        // Items
        smiggles = new Smiggles();
        fleebJuice = new FleebJuice();
    }

    @Test
    public void packingTest() {
        assertEquals("Box", box.envelop());
        assertEquals("Bottle", bottle.envelop());
    }

    @Test
    public void itemsTest() {
        // Cereals
        assertEquals("Smiggles", smiggles.name());
        assertEquals(50.0, smiggles.pvp(), 0.01);
        assertEquals("Box", smiggles.packing().envelop());
        assertEquals("Item: Smiggles, Packing: Box, Price: 50.0", smiggles.toString());

        // Drinks
        assertEquals("Fleeb Juice", fleebJuice.name());
        assertEquals(35.0, fleebJuice.pvp(), 0.01);
        assertEquals("Bottle", fleebJuice.packing().envelop());
        assertEquals("Item: Fleeb Juice, Packing: Bottle, Price: 35.0", fleebJuice.toString());
    }
}
