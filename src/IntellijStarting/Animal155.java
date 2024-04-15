package IntellijStarting;

enum FlightStages157 implements Trackable156 {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages157 getNextStage() {
        FlightStages157[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly157(String name, String type) implements FlightEnabled156 {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite157 implements OrbitEarth157 {
    FlightStages157 stage = FlightStages157.GROUNDED;

    @Override
    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth157 extends FlightEnabled156 {
    void achieveOrbit();
    static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages157 stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages157 transition(FlightStages157 stage) {
        FlightStages157 nextStage = FlightEnabled156.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled156 {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();

    default FlightStages157 transition(FlightStages157 stage) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;

        FlightStages157 nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to "+ nextStage);
        return nextStage;
    }
}

interface Trackable156 {
    void track();
}

public abstract class Animal155 {
    public abstract void move();
}
