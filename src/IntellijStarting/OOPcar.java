package IntellijStarting;

public class OOPcar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("lamborghini");
        car.setModel("Aventor");
        car.setColor("green");
        car.setDoor(2);
        car.setConvertible(true);
        System.out.println("made by = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println();
        car.describeCar();
    }
}
