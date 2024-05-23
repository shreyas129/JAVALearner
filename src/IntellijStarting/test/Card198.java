package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public record Card198(Suit198 suit, String face, int rank) {
    public enum Suit198 {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static Card198 getNumericCard(Suit198 suit, int cardNumber) {
        if (cardNumber > 1 && cardNumber < 11) {
            return new Card198(suit, String.valueOf(cardNumber), cardNumber - 2);
        }
        System.out.println("Invalid numeric card selected");
        return null;
    }

    public static Card198 getFaceCard(Suit198 suit, char abbrev) {
        int charIndex = "JQKA".indexOf(abbrev);
        if (charIndex > -1) {
            return new Card198(suit, "" + abbrev, charIndex + 9);
        }
        System.out.println("Invalid face card selected");
        return null;
    }

    public static List<Card198> getStandardDeck() {
        List<Card198> deck = new ArrayList<>(50);
        for (Suit198 suit : Suit198.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(getNumericCard(suit, i));
            }
            for (char c:new char[] {'J', 'Q', 'K', 'A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    public static void printDeck(List<Card198> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card198> deck, String description, int rows) {
        System.out.println("--------------------");
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
}
