package IntellijStarting;

import java.util.ArrayList;

public class Main150AbstractClasses {
    public static void main(String[] args) {
//        Animal150 animal = new Animal150("animal", "big", 100);
        Dog150 dog = new Dog150("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal150> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog150("German Shepard", "big", 150));
        animals.add(new Fish150("GoldFish", "small", 1));
        animals.add(new Fish150("Barracuda", "big", 75));
        animals.add(new Dog150("Pug", "small", 20));
        animals.add(new Horse150("Clydesdale", "large", 1000));

        for (Animal150 animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal150 animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
