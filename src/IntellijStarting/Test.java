package IntellijStarting;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet156());

//        OrbitEarth157.log("Testing" + new Satellite157());

        orbit(new Satellite157());
    }

    private static void inFlight(FlightEnabled156 flier) {
        flier.takeOff();
        flier.transition(FlightStages157.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable156 tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth157 flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
