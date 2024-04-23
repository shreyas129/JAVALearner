package IntellijStarting.test;

public class MainGenericClassChallenge167 {
    public static void main(String[] args) {
        var nationalUSParks = new Park168[] {
                new Park168("Yellowstone", "44.4882, -110.5916"),
                new Park168("Grand canyon", "36.1085, -112.0965"),
                new Park168("Yosemite", "37.885, -119.5360")
        };

        Layer168<Park168> parkLayer = new Layer168<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River168[] {
                new River168("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495", "35.1556, -90.0659"),
                new River168("Missouri", "45.9239, -111.4983", "38.8146, -901218")
        };

        Layer168<River168> riverLayer = new Layer168<>(majorUSRivers);

        riverLayer.addElements(new River168("Color","40.4708, -105.8286", "31.7811, -114.7724"), new River168("Delaware", "42.2026, -75.00836", "39.4955, -75.5592"));

        riverLayer.renderLayer();
    }
}
