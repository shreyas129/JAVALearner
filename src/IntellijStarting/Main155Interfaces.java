package IntellijStarting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main155Interfaces {
    public static void main(String[] args) {
        Bird155 bird = new Bird155();
        Animal155 animal = bird;
        FlightEnabled156 flier = bird;
        Trackable156 tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet156());

        Trackable156 truck = new Truck156();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled156.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled156> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled156> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled156 flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable156 tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled156> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled156> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled156> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }
}
