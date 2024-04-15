package IntellijStarting;

public class Truck156 implements Trackable156 {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
