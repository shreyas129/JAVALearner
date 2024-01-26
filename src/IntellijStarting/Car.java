package IntellijStarting;

public class Car {
    private String make = "Koniggseg Jesko";
    private String model = "Absolut";
    private String color = "Golden";
    private int door = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "lamborghini", "koniggseg", "buggati", "porsche" -> this.make = make;
            default -> {
                this.make = "Unsupproted car ";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(door + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}