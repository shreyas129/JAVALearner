package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class Layer168<T extends Mappable167> {
    private List<T> layerElements;

    public Layer168(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (T elements : layerElements) {
            elements.render();
        }
    }
}
