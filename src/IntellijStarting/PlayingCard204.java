package IntellijStarting;

public class PlayingCard204 {
    private String suit, face;
    private int internalHash;

    public PlayingCard204(String suit, String face) {
        this.suit = suit;
        this.face = face;
        internalHash = suit.equals("Hearts") ? 11 : 12;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard204 that = (PlayingCard204) o;
        return suit.equals(that.suit) && face.equals(that.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + face.hashCode();
        return result;
    }
}
