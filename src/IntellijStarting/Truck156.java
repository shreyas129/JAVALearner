package IntellijStarting;

public class Truck156 implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
