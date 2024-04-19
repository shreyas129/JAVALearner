package IntellijStarting.test;

enum Geometry161 {LINE, POINT, POLYGON}

enum Color {BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable161 {
    String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLabel();
    Geometry161 getShape();
    String getMarker();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable161 mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
