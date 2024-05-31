package IntellijStarting.test;

import java.util.*;
import java.util.function.Consumer;

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
        Consumer<PokerHand202> checkHand = PokerHand202::evalHand;
        pokerHands.forEach(checkHand.andThen(System.out::println));

        int cardsDealt = playerCount * cardsInHand;
        int cardsRemaining = deck.size() - cardsDealt;
        remainingCards = new ArrayList<>(Collections.nCopies(cardsRemaining, null));
        remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
        Card202.printDeck(remainingCards, "Remaining cards", 2);
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
