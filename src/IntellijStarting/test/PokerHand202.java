package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class PokerHand202 {
    private List<Card202> hand, keepers, discards;
    private Ranking202 score = Ranking202.NONE;
    private int playerNo;

    public PokerHand202(int playerNo,List<Card202> hand) {
        hand.sort(Card202.sortRankReversedSuit());
        this.hand = hand;
        this.playerNo = playerNo;
        keepers = new ArrayList<>(hand.size());
        discards = new ArrayList<>(hand.size());
    }

    @Override
    public String toString() {
        return "%d. %-16s Rank:%d %-40s %s".formatted(playerNo, score, score.ordinal(), hand, (discards.size()) > 0 ? "Discards:" + discards : "");
    }
}
