package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class Player48 implements ISaveable48{
    private String name, weapon;
    private int hitPoints, strength;

    public Player48(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        List<String> playerElements = new ArrayList<>();
        playerElements.add(0, name);
        playerElements.add(1, "" + hitPoints);
        playerElements.add(2, "" + strength);
        playerElements.add(3, weapon);
        return playerElements;
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
        weapon = listToRead.get(3);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
