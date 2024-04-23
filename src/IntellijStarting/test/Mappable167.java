package IntellijStarting.test;

import java.util.Arrays;

public interface Mappable167 {
    void render();
    static double[] stringToLatLon(String location) {
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[] {lat, lng};
    }
}

abstract class Point167 implements Mappable167{
    private double[] location = new double[2];

    public Point167(String location) {
        this.location= Mappable167.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }
}

abstract class Line167 implements Mappable167 {
    private double[][] locations;

    public Line167(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for(var l : locations) {
            this.locations[index++] = Mappable167.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }
}