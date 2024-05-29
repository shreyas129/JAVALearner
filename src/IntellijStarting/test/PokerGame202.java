package IntellijStarting.test;

import java.util.*;

public class PokerGame202 {
    private final List<Card202> deck = Card202.getStandardDeck();
    private int playerCount, cardsInHand;
    private List<PokerHand202> pokerHands;
    private List<Card202> remainingCards;

    public PokerGame202(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);
    }

    public void startPlay() {
        Collections.shuffle(deck);
        Card202.printDeck(deck);
        int randomMiddle = new Random().nextInt(15, 35);
        Collections.rotate(deck, randomMiddle);
        Card202.printDeck(deck);

        deal();
        System.out.println("------------------------");
        pokerHands.forEach(System.out::println);
    }

    private void deal() {
        Card202[][] hands = new Card202[playerCount][cardsInHand];
        for (int deckIndex = 0, i = 0; i < cardsInHand; i++) {
            for (int j = 0; j < playerCount; j++) {
                hands[j][i] = deck.get(deckIndex++);
            }
        }

        int playerNo = 1;
        for (Card202[] hand : hands) {
            pokerHands.add(new PokerHand202(playerNo++, Arrays.asList(hand)));
        }
    }
}
