package IntellijStarting.test;

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building162 implements Mappable161{
    private String name;
    private UsageType usage;

    public Building162(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry161 getShape() {
        return Geometry161.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color161.GREEN + " " + PointMarker161.TRIANGLE;
            case GOVERNMENT -> Color161.RED + " " + PointMarker161.STAR;
            case RESIDENTIAL -> Color161.BLUE + " " + PointMarker161.SQUARE;
            case SPORTS -> Color161.ORANGE + " " + PointMarker161.PUSH_PIN;
            default -> Color161.BLACK + " " + PointMarker161.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable161.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
