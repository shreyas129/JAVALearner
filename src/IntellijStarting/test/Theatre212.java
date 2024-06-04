package IntellijStarting.test;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Theatre212 {
    private String theatreName;
    private int seatsPerRow;
    private NavigableSet<Seat212> seats;

    public Theatre212(String theatreName, int rows, int totalSeats) {
        this.theatreName = theatreName;
        seatsPerRow = totalSeats / rows;
        seats = new TreeSet<>();
        for (int i = 0; i < totalSeats; i++) {
            char rowChar = (char) (i / seatsPerRow + (int) 'A');
            int seatInRow = i % seatsPerRow + 1;
            seats.add(new Seat212(rowChar, seatInRow));
        }
    }

    class Seat212 implements Comparable<Seat212> {
        private String seatNum;
        private boolean reserved;

        public Seat212(char rowChar, int seatNo) {
            seatNum = "%c%03d".formatted(rowChar, seatNo).toUpperCase();
        }

        @Override
        public String toString() {
            return seatNum;
        }

        @Override
        public int compareTo(Seat212 o) {
            return seatNum.compareTo(o.seatNum);
        }
    }

    public void printSeatMap() {
        String separatorLine = "-".repeat(90);
        System.out.printf("%1s%n%2s Seat Map%n%1s%n", separatorLine, theatreName, separatorLine);

        int index = 1;
        for (Seat212 s : seats) {
            System.out.printf("%-8s%s", s.seatNum + (s.reserved ? "(\u25CF)" : ""),
                    index++ % 10 == 0 ? "\n" : "");
        }
        System.out.println(separatorLine);
    }

    public String reserveSeat(char row, int seat) {
        Seat212 requestedSeat = new Seat212(row, seat);
        Seat212 requested = seats.ceiling(requestedSeat);
        if (requested == null || !requested.seatNum.equals(requestedSeat.seatNum)) {
            System.out.print("--> No such seat: " + requestedSeat);
            System.out.printf(": Seat must be between %s and %s%n", seats.first().seatNum, seats.last().seatNum);
        } else {
            if (!requested.reserved) {
                requested.reserved = true;
                return requested.seatNum;
            } else {
                System.out.println("Seat's already reserved");
            }
        }
        return null;
    }

    private boolean validate(int count, char first, char last, int min, int max) {
        boolean result = min > 0 || seatsPerRow >= count || max - min + 1 >= count;
        result = result && seats.contains(new Seat212(first, min));
        if (!result) {
            System.out.printf("Invalid! ₹%1d seats between " + "₹%2c[₹%3d-₹%4d]-₹%5c[₹%3d-₹%4d Try again",count, first, min, max, last, min, max);
            System.out.printf(": Seat must be between %s and %s%n", seats.first().seatNum, seats.last().seatNum);
        }
        return result;
    }

    public Set<Seat212> reserveSeats(int count, char minRow, char maxRow, int minSeat, int maxSeat) {
        char lastValid = seats.last().seatNum.charAt(0);
        maxRow = maxRow < lastValid ? maxRow : lastValid;
        if (!validate(count, minRow, maxRow, minSeat, maxSeat)) {
            return null;
        }
        NavigableSet<Seat212> selected = null;
        for (char letter = minRow; letter <= maxRow; letter++) {
            NavigableSet<Seat212> contiguous = seats.subSet(new Seat212(letter, minSeat), true, new Seat212(letter, maxSeat), true);

            int index = 0;
            Seat212 first = null;
            for (Seat212 current : contiguous) {
                if (current.reserved) {
                    index = 0;
                    continue;
                }
                first = index == 0 ? current : first;
                if (index++ == count) {
                    selected = contiguous.subSet(first, true, current, true);
                    break;
                }
            }
            if (selected != null) {
                break;
            }
        }

        Set<Seat212> reservedSeats = null;
        if (selected != null) {
            selected.forEach(s -> s.reserved = true);
            reservedSeats = new TreeSet<>(selected);
        }
        return reservedSeats;
    }
}
