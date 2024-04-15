package IntellijStarting;

public class Jet156 implements FlightEnabled156, Trackable156 {
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }

    @Override
    public FlightStages157 transition(FlightStages157 stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnabled156.super.transition(stage);
    }
}
