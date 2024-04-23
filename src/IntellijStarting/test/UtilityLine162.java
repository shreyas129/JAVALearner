package IntellijStarting.test;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class UtilityLine162 implements Mappable161{
    private String name;
    private UtilityType type;

    public UtilityLine162(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry161 getShape() {
        return Geometry161.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color161.RED + " " + LineMarker161.DASHED;
            case FIBER_OPTIC -> Color161.GREEN + " " + LineMarker161.DOTTED;
            case GAS -> Color161.ORANGE + " " + LineMarker161.SOLID;
            case WATER -> Color161.BLUE + " " + LineMarker161.SOLID;
            default -> Color161.BLACK + " " + LineMarker161.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable161.super.toJSON() + """
                , "name": "%s", "utility": "%s" """.formatted(name, type);
    }
}
