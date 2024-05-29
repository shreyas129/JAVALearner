package IntellijStarting.test;

import java.util.*;

public class Main198DeckOfCardsChallenge {
    public static void main(String[] args) {
        Card198[] cardArray = new Card198[13];
        Card198 aceOfHearts = Card198.getFaceCard(Card198.Suit198.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card198.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card198> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

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

        List<Card198> deck = Card198.getStandardDeck();
        Card198.printDeck(deck);

        Collections.shuffle(deck);
        Card198.printDeck(deck, "Shuflled deck", 4);

        Collections.reverse(deck);
        Card198.printDeck(deck, "reversed deck of cards", 4);

        var sortingAlgorithm = Comparator.comparing(Card198::rank).thenComparing(Card198::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card198.printDeck(deck, "Standard deck sorted by rank, suit", 13);

        Collections.reverse(deck);
        Card198.printDeck(deck, "Sorted by rank, suit reversed:", 13);

        List<Card198> kings = new ArrayList<>(deck.subList(4, 8));
        Card198.printDeck(kings, "Kings in deck", 1);

        List<Card198> tens = new ArrayList<>(deck.subList(16, 20));
        Card198.printDeck(tens, "Tens in deck", 1);

        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint = " + disjoint2);

        deck.sort(sortingAlgorithm);
        Card198 tenOfHearts = Card198.getNumericCard(Card198.Suit198.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
        System.out.println("foundIndex = " + foundIndex);
        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        Card198 tenOfClubs = Card198.getNumericCard(Card198.Suit198.CLUB, 10);
        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card198.printDeck(deck.subList(32, 36), "Tens list", 1);

        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card198.printDeck(deck.subList(32, 36), "Tens list", 1);

        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)) {
            System.out.println("Tens Of hearts replaced with tens of clubs");
        } else {
            System.out.println("No matching tens of hearts were found");
        }

        System.out.println("Tens of club cards = " + Collections.frequency(deck, tenOfClubs));

        System.out.println("Best card = " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Worst card = " + Collections.min(deck, sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card198::suit).thenComparing(Card198::rank);
        deck.sort(sortBySuit);
        Card198.printDeck(deck, "Sorted by suit", 4);

        List<Card198> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("UnRotate: " + deck.subList(0, 13));
        System.out.println("Rotate: " + 2 + ": " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("UnRotate: " + deck.subList(0, 13));
        System.out.println("Rotate: " + -2 + ": " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        for (int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println("Manual reverse :" + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using reverse :" + copied);
    }
}
