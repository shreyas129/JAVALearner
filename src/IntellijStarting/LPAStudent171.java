package IntellijStarting;

public class LPAStudent171 extends Student171{
    private double percentComplete;

    public LPAStudent171() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
