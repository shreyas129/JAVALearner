package IntellijStarting.test;

public class River168 extends Line167{
    private String name;

    public River168(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " river";
    }
}
