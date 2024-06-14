package IntellijStarting.test;

import java.util.Scanner;

public class Main217AdventureGameChallenge {
    public static void main(String[] args) {
        String myLocations = """
                lake,at the edge of Lake Shreyas,E:ocean,W:forest,S:well house,N:cave
                ocean,on Shreyas's beach before an angry sea,W:lake
                cave,at the mouth of Shreyas's bat cave,E:ocean,W:forest,S:lake
                """;
        AdventureGame217 game = new AdventureGame217(myLocations);
        game.play("lake");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) break;
            game.move(direction);
        }
    }
}
