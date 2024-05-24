package IntellijStarting.test;

import java.util.*;

public class Main198DeckOfCardsChallenge {
    public static void main(String[] args) {
        List<Card198> deck = Card198.getStandardDeck();
        Card198.printDeck(deck);

        Card198[] cardArray = new Card198[13];
        Card198 aceOfHearts = Card198.getFaceCard(Card198.Suit198.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card198.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card198> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size()" + cards.size());

        List<Card198> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card198.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card198 kingOfClubs = Card198.getFaceCard(Card198.Suit198.CLUB, 'K');
        List<Card198> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card198.printDeck(kingsOfClubs, "Kings of clubs", 1);


        Collections.addAll(cards, cardArray);
        Card198.printDeck(cards, "Card collection with aces added", 1);

        Collections.addAll(cards, cardArray);
        Collections.copy(cards, kingsOfClubs);
        Card198.printDeck(cards, "Card collection with kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card198.printDeck(cards, "List Copy of Kings", 1);
    }
}
