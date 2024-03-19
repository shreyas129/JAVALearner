package IntellijStarting;

public class Player {
    public String fullName, weapon;
    public int health;

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player is knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
