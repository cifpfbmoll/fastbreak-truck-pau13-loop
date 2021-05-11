package edu.pingpong.fastbreaktruck.app;

import edu.pingpong.fastbreaktruck.domain.builder.FastBreakTruck;
import edu.pingpong.fastbreaktruck.domain.builder.Meal;

// import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.FastBreakTruck;
// import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;

public class App {

    public static void main(String[] args) {

        final String priceOutput = "Price order: ";

        /**
         * Desayuno Eyeholes
         */

        Meal eyeDes = FastBreakTruck.prepareEyeholes();
        System.out.println("\n\tDon't open the box of Eyeholes !");
        eyeDes.showItems();
        System.out.print(priceOutput + eyeDes.getTotalPrice());

        // /**
        // * Desayuno Smiggles
        // */

        Meal smigDes = FastBreakTruck.prepareSmiggles();
        System.out.println("\n\n\tSmiggles for the kids !");
        smigDes.showItems();
        System.out.print(priceOutput + smigDes.getTotalPrice());

        // /**
        // * Plumbus
        // */

        eyeDes = FastBreakTruck.prepareEyeholes();
        FastBreakTruck.addToy(eyeDes);
        System.out.println("\n\n\tEyeholes con plumbus!");
        eyeDes.showItems();
        System.out.print(priceOutput + eyeDes.getTotalPrice());
    }
}
