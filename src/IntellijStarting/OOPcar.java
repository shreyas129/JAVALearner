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

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("targa");
        targa.setColor("red");
        targa.setDoor(2);
        targa.setConvertible(false);
        targa.describeCar();
    }
}
