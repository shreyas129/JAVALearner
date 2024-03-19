package IntellijStarting;

public class Main104Encapsulation {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Shreyas";
//        player.health = 20;
//        player.weapon = "MiniGun";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer shreyas = new EnhancedPlayer("Shreyas", 200, "MiniGun");
        System.out.println("Initial health is " + shreyas.healthPercentageRemaining());
    }
}
