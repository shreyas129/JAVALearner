package IntellijStarting.test;

public class LPAStudent174 extends Student174 {
    private double percentComplete;

    public LPAStudent174() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    @Override
    public boolean matchField(String fieldName, String value) {
        if(fieldName.equalsIgnoreCase("percentComplete")){
            return percentComplete<=Integer.parseInt(value);
        }
        return super.matchField(fieldName, value);
    }
}
