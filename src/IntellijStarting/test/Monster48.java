package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class Monster48 implements ISaveable48{
    private String name;
    private int hitPoints, strength;

    public Monster48(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> MonsterElements = new ArrayList<>();
        MonsterElements.add(0, name);
        MonsterElements.add(1, "" + hitPoints);
        MonsterElements.add(2, "" + strength);
        return MonsterElements;
    }

    @Override
    public void read(List<String> listToRead) {
        if (listToRead == null) {
            return;
        }
        if (listToRead.size() <= 0) {
            return;
        }
        name = listToRead.get(0);
        hitPoints = Integer.parseInt(listToRead.get(1));
        strength = Integer.parseInt(listToRead.get(2));
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
