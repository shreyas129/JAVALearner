package IntellijStarting.test;

public class Song45 {
    private String title;
    private double duration;

    public Song45(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", title,  duration);
    }
}