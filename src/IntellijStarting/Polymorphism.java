package IntellijStarting;

import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
//        Movie themovie = Movie.getMovie("ScienceFiction", "Star Wars");
//        themovie.watchMovie();

        Scanner s  = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit) : ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
