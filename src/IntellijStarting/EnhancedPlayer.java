package IntellijStarting;

public class EnhancedPlayer {
    private String fullName, weapon;
    private int healthPercentage;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "gun");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealthPercentage(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            System.out.println("Player is knocked out of game");
        }
    }

    public int healthPercentageRemaining() {
        return healthPercentage;
    }

    public void restorehealthPercentage(int extrahealthPercentage) {
        healthPercentage += extrahealthPercentage;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
