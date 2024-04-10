package IntellijStarting;

public class Horse150 extends Mammal{

    public Horse150(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
