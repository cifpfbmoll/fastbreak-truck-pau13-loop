package edu.pingpong.fastbreaktruck.app;

import edu.pingpong.fastbreaktruck.domain.builder.FastBreakTruck;
import edu.pingpong.fastbreaktruck.domain.builder.Meal;

// import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.FastBreakTruck;
// import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;

public class App {

    public static void main(String[] args) {

        /**
         * Desayuno Eyeholes
         */

        Meal eyeDes = FastBreakTruck.prepareEyeholes();
        System.out.println("\n\tNo abras la caja de Eyeholes!");
        eyeDes.showItems();
        System.out.print("Precio pedido: " + eyeDes.getTotalPrice());

        // /**
        // * Desayuno Smiggles
        // */

        Meal smigDes = FastBreakTruck.prepareSmiggles();
        System.out.println("\n\n\tSmiggles per als nins!");
        smigDes.showItems();
        System.out.print("Precio pedido: " + smigDes.getTotalPrice());

        // /**
        // * Plumbus
        // */

        eyeDes = FastBreakTruck.prepareEyeholes();
        FastBreakTruck.addToy(eyeDes);
        System.out.println("\n\n\tEyeholes con plumbus!");
        eyeDes.showItems();
        System.out.print("Precio pedido: " + eyeDes.getTotalPrice());
    }
}
