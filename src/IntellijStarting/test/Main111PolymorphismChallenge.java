package IntellijStarting.test;

public class Main111PolymorphismChallenge {
    public static void main(String[] args) {
        Car car = new Car("the normal car");
        car.startEngine();
        car.runEngine();
        car.drive();

        GasPoweredCar gasPoweredCar = new GasPoweredCar("the Gas Powered Car", 15.5, 4);
        gasPoweredCar.startEngine();
        gasPoweredCar.runEngine();
        gasPoweredCar.drive();

        ElectricCar electricCar = new ElectricCar("The electric car", 200, 40);
        electricCar.startEngine();
        electricCar.runEngine();
        electricCar.drive();

        HybridCar hybridCar = new HybridCar("The hybrid car", 80.0, 20, 4);
        hybridCar.startEngine();
        hybridCar.runEngine();
        hybridCar.drive();
    }
}
