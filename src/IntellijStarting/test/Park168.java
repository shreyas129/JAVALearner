package IntellijStarting.test;

public class Park168 extends Point167{
    private String name;

    public Park168(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " national park";
    }
}
