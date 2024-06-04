package IntellijStarting.test;

import java.util.NavigableSet;
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
            System.out.printf("Adding seat %d%n", i);
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
}
