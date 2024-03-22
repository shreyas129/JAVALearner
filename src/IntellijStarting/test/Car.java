package IntellijStarting.test;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine Started!");
    }

    public void drive() {
        System.out.println("Driving the car!");
    }

    protected void runEngine() {
        System.out.println("Engine is running!");
        System.out.println(this.getClass().getSimpleName());
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinder;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}