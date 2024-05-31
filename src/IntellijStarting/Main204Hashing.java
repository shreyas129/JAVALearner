package IntellijStarting;

import java.util.*;

public class Main204Hashing {
    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        for (String setValue : mySet) {
            System.out.print(setValue + ": ");
            for (int i = 0; i < hellos.size(); i++) {
                if (setValue == hellos.get(i)) System.out.print(i + ", ");
            }
            System.out.println(" ");
        }

        PlayingCard204 aceHearts = new PlayingCard204("Hearts", "Ace");
        PlayingCard204 kingOfClubs = new PlayingCard204("Clubs", "King");
        PlayingCard204 queenSpades = new PlayingCard204("Spades", "Queen");

        List<PlayingCard204> cards = Arrays.asList(aceHearts, kingOfClubs, queenSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard204> deck = new HashSet<>();
        for (PlayingCard204 c : cards) {
            if (!deck.add(c)) {
                System.out.println("Found duplicate for " + c);
            }
        }
        System.out.println(deck
        );
    }
}
